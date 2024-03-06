package sec09.chap02;

public class Button {
    private String text;
    public Button(String text){
        this.text=text;
    }
    public String getText(){return text;}

    private Runnable onClickListner;
    public void setOnClickListner(Runnable onClickListner){
        this.onClickListner=onClickListner;
    }
    public void onClick(){
        onClickListner.run();
    }
}
