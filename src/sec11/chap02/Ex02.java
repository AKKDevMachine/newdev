package sec11.chap02;

public class Ex02 {
    public static void main(String[] args) {
        Thread thr0 = new Thread(new PrintThrNoRun(0));
        Thread thr1 = new Thread(new PrintThrNoRun(1));
        Thread thr2 = new Thread(new PrintThrNoRun(2));
        //thr0.start();
        //thr1.start();
        //thr2.start();

        new Thread(() -> {
            for (var i = 0; i < 20; i++) {
                System.out.print(3);
                for (var j = 0; j < Integer.MAX_VALUE; j++) {}

                Thread.yield(); // ⭐
            }
        }).start();

        for (var i = 0; i < 20; i++) {
            System.out.print('M');
            for (var j = 0; j < Integer.MAX_VALUE; j++) {}
        }
    }
}
