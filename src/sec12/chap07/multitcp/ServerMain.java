package sec12.chap07.multitcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerMain {
    public static final int PORT_NUM = 3456;
    public static final String HOST = "localhost";

    public static void main(String[] args) throws IOException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        ServerSocket serverSkt = new ServerSocket(PORT_NUM);
        while (true) {
            es.execute(new ServerRun(serverSkt.accept()));
        }

    }
}
