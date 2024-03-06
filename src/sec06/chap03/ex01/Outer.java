package sec06.chap03.ex01;

public class Outer {
    private String inst = "인스턴스";
    private static String sttc = "클리스";
    class InnerInstMember{
        private String name = inst + "필드로서의 클래스";
        private InnerSttcMember innerSttcMember = new InnerSttcMember();

        public void func(){
            System.out.println(name);
        }
    }

    public static class InnerSttcMember{
        private String name = sttc + "필드로서의 클래스";
        //private InnerInstMember innerInstMember = new InnerInstMember();

        public void func(){
          //  name += inst;
            System.out.println(name);
        }

    }

    public void memberFunc(){
        class MethodMember{
            String instSttc = inst + " " + sttc;
            InnerInstMember innerInstMember = new InnerInstMember();
            InnerSttcMember innerSttcMember = new InnerSttcMember();

            public void func(){
                innerInstMember.func();
                innerSttcMember.func();
                System.out.println("메소드 안의 클래스");
            }
        }

        new MethodMember().func();

    }
    public void innerFuncs(){
        new InnerInstMember().func();
        new InnerSttcMember().func();
    }
    public InnerInstMember getInnerInstMember(){
        return new InnerInstMember();
    }
}
