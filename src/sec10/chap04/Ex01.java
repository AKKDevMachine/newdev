package sec10.chap04;

import java.util.Random;

public class Ex01 {
    public static void maybeException1 () {
        if (new Random().nextBoolean()) {
            throw new RuntimeException();
        }
    }
  /*  public static void maybeException2 () {
        if (new Random().nextBoolean()) {
            throw new FileNotFoundException();
        }
    }*/
}
