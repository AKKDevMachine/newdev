package sec11.chap01;

import java.util.stream.IntStream;

public class WrongSleep {
    public static void main(String[] args) {
        Thread sleeper = new Thread(()->
                IntStream.range(0,5)
                        .forEach(i->{
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                throw new RuntimeException();
                            }
                            System.out.println("쿨");
                        }));
        sleeper.start();
        try {
            sleeper.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("잘잤다!");
    }
}
