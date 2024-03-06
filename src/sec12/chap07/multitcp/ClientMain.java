package sec12.chap07.multitcp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 20; i++) {
            es.execute(new ClientRun());
        }
        es.shutdown();
    }
}
