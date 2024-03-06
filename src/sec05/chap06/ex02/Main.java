package sec05.chap06.ex02;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------------------------\n");
        YalcoChicken ycStores[] = {
                new YalcoChicken(3, "판교"),
                new YalcoChicken(17, "강남"),
                new YalcoChickenDT(108, "철원"),
        };

        for(YalcoChicken store : ycStores){
            if(store instanceof YalcoChickenDT){
                ((YalcoChickenDT) store).takeDTOrder();
            }else{
                store.takeHallOrder();
            }
        }
    }
}
