package sec11.chap01;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (var i = 0; i < 20; i++) {
            // 😴

            System.out.print(2);
        }
    }
}
