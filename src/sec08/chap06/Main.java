package sec08.chap06;

import sec07.chap04.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Java.lang.Iterable 인터페이스 구현 클래스에서 사용
        //컬렉션을 순회하는데 사용
        //-투어가이드, 순시 감찰관 역할
        //-특정 기준의 요소들 제거 유용
        //-순회 상태가 저장될 필요가 있을때 유용

        Set<Integer> intHSet = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Iterator<Integer> intItor = intHSet.iterator();
        Integer int1 = intItor.next();
        Integer int2 = intItor.next();
        Integer int3 = intItor.next();

        boolean hasNext = intItor.hasNext();

        intItor = intHSet.iterator();
        while(intItor.hasNext()){
            if(intItor.next()%3==0){
                intItor.remove();
            }
        }

        List<Unit> enemies = new ArrayList<>(
                Arrays.asList(
                        new Swordman(Side.RED),
                        new Knight(Side.RED),
                        new Swordman(Side.RED),
                        new Swordman(Side.RED),
                        new Knight(Side.RED),
                        new Knight(Side.RED),
                        new Swordman(Side.RED),
                        new MagicKnight(Side.RED),
                        new Swordman(Side.RED),
                        new MagicKnight(Side.RED),
                        new Knight(Side.RED),
                        new MagicKnight(Side.RED))
        );
        Iterator<Unit> enemyItor = enemies.iterator();
        var thunderBolts=3;
        var fireBalls=4;
        while(enemyItor.hasNext()&&thunderBolts-->0){
            var enemy = enemyItor.next();
            System.out.printf("%s 벼락공격%n", enemy);
            enemy.hp-=50;
        }
        while (enemyItor.hasNext() && fireBalls-- > 0) {
            var enemy = enemyItor.next();
            System.out.printf("%s 파이어볼 공격%n", enemy);
            enemy.hp -= 30;
        }
        while (enemyItor.hasNext()) {
            var enemy = enemyItor.next();
            System.out.printf("%s 화살 공격%n", enemy);
            enemy.hp -= 10;
        }
        System.out.println("\n- - - - -\n");
        Map<Integer, Double> hashMap = new HashMap<>();
        for(var i=0; i<10; i++){
            hashMap.put(i+1,Math.random()*10);
        }
        Iterator<Integer> hmKeyItor = hashMap.keySet().iterator();
        Iterator<Double> hmValueItor = hashMap.values().iterator();
        Iterator<Map.Entry<Integer, Double>> hmEntryItor=hashMap.entrySet().iterator();

        while (hmKeyItor.hasNext()) {
            System.out.println(hmKeyItor.next());
        }
        System.out.println("\n- - - - -\n");

        while (hmValueItor.hasNext()) {
            System.out.println(hmValueItor.next());
        }
        System.out.println("\n- - - - -\n");

        while (hmEntryItor.hasNext()) {
            System.out.println(hmEntryItor.next());
        }

        while (hmKeyItor.hasNext()) {
            int i = hmKeyItor.next();
            if (i % 3 == 0) hmKeyItor.remove();
        }
        while (hmValueItor.hasNext()) {
            double d = hmValueItor.next();
            if (d < 5) hmValueItor.remove();
        }
        while (hmEntryItor.hasNext()) {
            Map.Entry<Integer, Double> e = hmEntryItor.next();
            if (e.getKey() % 2 == 0) {
                hmEntryItor.remove();
            }
        }
    }
}
