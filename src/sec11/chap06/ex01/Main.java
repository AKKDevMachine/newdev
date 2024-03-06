package sec11.chap06.ex01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(15);
        //ExecutorService es = Executors.newSingleThreadExecutor();
        Cave cave = new Cave();
        while(cave.getWater()>20){
            es.execute(new VolunteerRun(cave));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
        es.shutdown();
    }

}
