package sec11.chap09;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Runnable toHashMap = ()->{
            for(int i=0;i<10000;i++){
                hashMap.put("key"+i,i);
            }
        };
        Thread t1 = new Thread(toHashMap);
        Thread t2 = new Thread(toHashMap);
        Thread t3 = new Thread(toHashMap);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       /* try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
        }*/
        System.out.printf(
                "" +
                        "해시맵 사이즈 = %d%n",
                hashMap.size()
        );
    }
}
