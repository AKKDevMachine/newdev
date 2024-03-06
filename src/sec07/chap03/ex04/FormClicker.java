package sec07.chap03.ex04;

public class FormClicker<T extends FormElement&Clickable> {
    private T formElem;
    public FormClicker(T formElem){
        this.formElem=formElem;
    }

    public void printElemMode(){
        formElem.printMode();
    }
    public void clickElem(){
        formElem.onClick();
    }
}
