package sec11.chap04;

public class Cache3 {
    static boolean stop = false;
    synchronized public static boolean isStop(){
        return stop;
    }
    synchronized public static void setStop(boolean stop){
        Cache3.stop=stop;
    }

    public static void main(String[] args) {
        new Thread(()->{
            int i = 0;
            while(!isStop()){
                i++;
            }
            System.out.println("---스레드 종료----");
        }).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setStop(true);
    }
}
