package sec05.chap05.ex02;

public class Main {
    public static void main(String[] args) {
        Button entrButton = new Button("Enter");
        ShutDownButton stdbButton = new ShutDownButton();
        ToggleButton tglButton = new ToggleButton("CapsLock", false);

        entrButton.func();

        System.out.println("/n----------------------------/n");

        stdbButton.func();

        System.out.println("/n----------------------------/n");

        tglButton.func();
        tglButton.func();
        tglButton.func();

    }
}
