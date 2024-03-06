package sec10.chap06;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        String nulStr = null;
        //System.out.println(nulStr.length());
        System.out.println(carOrNull().length());

        try {
            System.out.println(carOrNull().length());
        } catch (NullPointerException ne) {
            ne.printStackTrace();
            System.out.println(0);
        }
    }

    public static String carOrNull(){
        return new Random().nextBoolean() ? "Cat" : null;
    }
}
