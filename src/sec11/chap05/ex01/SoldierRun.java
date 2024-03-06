package sec11.chap05.ex01;

import sec11.chap05.ex01.PhoneBooth;

public class SoldierRun implements Runnable{
    String title;
    PhoneBooth phoneBooth;

    public SoldierRun(String title, PhoneBooth phoneBooth) {
        this.title = title;
        this.phoneBooth = phoneBooth;
    }

    @Override
    public void run(){
        while(true){
            phoneBooth.phoneCall(this);
        }
    }
}
