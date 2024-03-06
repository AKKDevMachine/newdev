package sec05.chap06.ex02;

public class YalcoChickenDT extends YalcoChicken {
    private boolean driveThruOpen = true;

    public YalcoChickenDT(int no, String name){
        super(no, name);
    }

    public void setDriveThruOpen(boolean driveThruOpen){
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder(){
        System.out.printf("%d호 %s점 드라이브스루 주문 %s%n",no, name,
                (driveThruOpen?"받음":"불가"));
    }
}
