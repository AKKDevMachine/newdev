package sec11.chap06.ex02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExp {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> callAnswer = es.submit(()->{
            Thread.sleep(2000);
            int i = 0;
            while(i<10){
                System.out.println(i);
                i++;
            }
            return i+"여보이소~";
        });

        while (!callAnswer.isDone()) {
            System.out.println("📞 따르릉...");
            try { Thread.sleep(400);
            } catch (InterruptedException e) {}
        }
        String result = null;
        try { result = callAnswer.get();
        } catch (InterruptedException | ExecutionException e) {}

        System.out.println("✅ 통화 시작 - " + result);
        System.out.println("- - - 작업 종료 - - -");
        es.shutdown();
    }
}
