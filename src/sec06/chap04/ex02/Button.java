package sec06.chap04.ex02;

public class Button {
    String name;
    public Button(String name){
        this.name = name;
    }

    private OnClickListener onClickListener;
    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void func(){
        onClickListener.onClick();
    }
}
