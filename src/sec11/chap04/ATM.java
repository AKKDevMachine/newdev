package sec11.chap04;

import java.util.Random;

public class ATM {
    private int balance = 0;
    public void addMoney(int amount){
        balance+=amount;
    }
    public int getBalance(){
        return balance;
    }
    synchronized public void withdraw(String name, int amount){
        if(balance<amount) return;
        System.out.printf(
                "💰 %s 인출 요청 (현 잔액 %d)%n",
                name, balance
        );
        try {
            Thread.sleep(new Random().nextInt(700,1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balance-=amount;
        balance -= amount;
        System.out.printf(
                "✅ %s 인출 완료 (현 잔액 %d)%n",
                name, balance
        );
    }
}
