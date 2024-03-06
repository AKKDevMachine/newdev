package sec13.chap02.ex02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatF {
    int a();
    int b();
}
