package sec07.chap03.ex03;

import sec05.chap09.ex01.*;

public class Main {
    public static void main(String[] args) {
        descHuntingMamal(new PolarBear());
        //descHuntingMamal(new GlidingLizard()); // ⚠️ 불가

        descFlyingHunter(new Eagle());
        descFlyingHunter(new GlidingLizard());
        //descFlyingHunter(new PolarBear()); // ⚠️ 불가

    }
    public static<T extends Number> double add2Num(T a,T b){
        return a.doubleValue() + b.doubleValue();
    }
    public static <T extends Mamal& Hunter& Swimmer>
    void descHuntingMamal(T animal){
        System.out.printf("겨울잠 %s%n", animal.hibernation ? "잠" : "자지 않음");
        animal.hunt();
    }
    public static <T extends Flyer&Hunter>
    void descFlyingHunter(T animal){
        animal.fly();
        animal.hunt();
    }
}
