package sec05.chap04.ex02;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button('1',1);
        Button.swtichmode();

        button1.setSpace(3);
        button1.setSpace(-1);

        String button1Info = button1.getButtonInfo();

    }
}
