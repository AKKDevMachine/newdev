package sec13.chap02.ex02;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Repeatable(Repeats.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatT {
    int a();
    int b();
}
