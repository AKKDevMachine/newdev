package sec13.chap02.ex01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
    @Deprecated
    public static void deprecatedMethod(){
        System.out.println("");
    }

    @SuppressWarnings("unchecked")
    public static void warnedMethod(){
        ArrayList list = new ArrayList();
        list.add("감자");
        list.add("고구마");
        System.out.println(list);
    }
}
