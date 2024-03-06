package sec05.chap06.ex03;

import sec05.chap05.ex03.FireSlime;
import sec05.chap06.ex01.Button;
import sec05.chap06.ex01.ShutDownButton;
import sec05.chap06.ex02.YalcoChicken;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();

        Object obj2 = new YalcoChicken(3,"판교");
        Object obj3 = new ShutDownButton();
        Object obj4 = new FireSlime();

        Object obj5 = true;
        Object obj6 = 1;
        Object obj7 = "Hello";

        Object[] objs = {
                1, false, 3.45, '가', "안녕하세요", new Button("Space")
        };
        for (Object obj : objs){
            System.out.println(obj);
        }
    }
}
