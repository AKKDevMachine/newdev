package sec05.chap07;

public class Main {
    public static void main(String[] args) {
        String ycCreed = YalcoChicken.CREED;
        //YalcoChicken.CREED = "우리의 튀김옷은 바삭하다";

        final YalcoChicken store1 = new YalcoChicken(3, "판교");

        //store1= new YalcoChicken(17, "강남");
        store1.name = "선릉";
    }
}
