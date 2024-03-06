package sec13.chap02.ex02;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.lang.annotation.*;
@CustomAnnt
@InheritF
@InheritT
public class MyClass {
    int field;

    @TargConstr
    public MyClass(){

    }
    @TargField
    @TargMulti
    int targField;

    @TargMulti
    public void targMethod(){}

    @TargMulti
    boolean targMulti = true;

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("\n- - - - -\n");

        Class<?> mySubclass = Class.forName("sec13.chap02.ex02.MySubclass");
        System.out.println(
                "MySubclass의 어노테이션 : " +
                        Arrays.stream(mySubclass
                                        .getAnnotations())
                                .map(Annotation::toString)
                                .collect(Collectors.joining(","))
        );

        System.out.println("\n- - - - -\n");

        @RepeatF(a=1,b=2)
                @RepeatT(a=1,b=2)
                @RepeatT(a=3,b=4)
                @RepeatT(a=5,b=6)
        boolean repeat;
    }
}
