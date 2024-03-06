package sec13.chap03.ex01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PersonInfo {
    PersonName personName();
    int age();
    boolean married();
}
