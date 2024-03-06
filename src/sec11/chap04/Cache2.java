package sec11.chap04;

public class Cache2 {
    volatile static boolean stop = false;

    public static void main(String[] args) {
        new Thread(()->{
            int i = 0;
            while(!stop){
                i++;
            }
            System.out.println("---스레드 종료----");
        }).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        stop=true;
    }
}
