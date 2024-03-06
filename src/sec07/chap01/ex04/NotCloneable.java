package sec07.chap01.ex04;

public class NotCloneable {
    String title;
    int no;
    int[] number;
    Click click;
    Click[] clicks;

    public NotCloneable(String title, int no, int[] number, Click click, Click[] clicks) {
        this.title = title;
        this.no = no;
        this.number = number;
        this.click = click;
        this.clicks = clicks;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
