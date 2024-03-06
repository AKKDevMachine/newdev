package sec11.chap02;

public class Ex01 {
    public static void main(String[] args) {
        Thread tarzanThread = new Thread(new TarzanRun(100));
        tarzanThread.setName("타잔송");
        tarzanThread.start();
    }
}
