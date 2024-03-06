package sec06.chap03.ex01;

public class Main {
    public static void main(String[] args) {
        Outer.InnerSttcMember staticMember = new Outer.InnerSttcMember();
        staticMember.func();

        System.out.println("\n-----------------\n");

        Outer outer = new Outer();
        outer.innerFuncs();

        System.out.println("\n-----------------\n");

        Outer.InnerInstMember innerInstMember = outer.getInnerInstMember();
        innerInstMember.func();

        System.out.println("\n-----------------\n");

        outer.memberFunc();


    }
}
