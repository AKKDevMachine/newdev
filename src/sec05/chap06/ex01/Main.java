package sec05.chap06.ex01;

public class Main {

    public static void main(String[] args) {
        Button button1 = new Button("Enter");
        Button button2 = new ShutDownButton();
        Button button3= new ToggleButton("CapsLock", true);

        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock",false),
                new ShutDownButton()};

        for(Button button : buttons){
            button.func();
        }

        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

        Button[] buttons1 = {
                new Button("Space"),
                new ToggleButton("Numlock", false),
                new ShutDownButton()
        };
        for(Button btn : buttons1){
            if(btn instanceof ShutDownButton) continue;
            btn.func();
        }
    }

}

