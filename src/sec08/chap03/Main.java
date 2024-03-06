package sec08.chap03;

import com.sun.source.tree.Tree;
import sec07.chap04.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intHSet1= new HashSet<>();
        intHSet1.add(1);
        intHSet1.add(1);
        intHSet1.add(2);
        intHSet1.add(3);

        List<Integer> ints1 = new ArrayList<>(
                Arrays.asList(1,1,2,2,3,3,4,5,6,7));
        Set<Integer> intHSet2=new HashSet<>(ints1);
        for(var i : intHSet1){
            System.out.println(i);
        }
        ints1.clear();
        ints1.addAll(intHSet2);

        boolean has2 = intHSet1.contains(2);
        boolean has4 = intHSet2.contains(4);
        boolean rm3 = intHSet1.remove(3);
        boolean rm4 = intHSet2.remove(4);

        intHSet2.removeAll(intHSet1);

        Set<Swordman> swordmanSet = new HashSet<>();
        Swordman swordman = new Swordman(Side.RED);
        swordmanSet.add(swordman);
        swordmanSet.add(swordman);
        swordmanSet.add(new Swordman(Side.RED));
        swordmanSet.add(new Swordman(Side.RED));
        swordmanSet.remove(swordman);

        HashSet<Integer> intHashSet = new HashSet<>();
        LinkedHashSet<Integer> intLinkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> intTreeSet = new TreeSet<>();

        for(int i : new int[]{3, 1, 8, 5, 4, 7, 2, 9, 6}){
            intHashSet.add(i);
            intLinkedHashSet.add(i);
            intTreeSet.add(i);
        }
        for(var s : new Set[]{intHashSet,intLinkedHashSet,intTreeSet} ){
            System.out.println(s);
        }

        System.out.println(intHashSet);

        Set<String> strHashSet = new HashSet<>();
        Set<String> strLinkedHashSet = new LinkedHashSet<>();
        TreeSet<String> strTreeSet = new TreeSet<>();

        for(String s : new String[]{
                "Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"}){
            strHashSet.add(s);
            strLinkedHashSet.add(s);
            strTreeSet.add(s);
        }
        for(var s : new Set[]{strHashSet,strLinkedHashSet,strTreeSet}){
            System.out.println(s);
        }

        int firstInt = intTreeSet.first();
        String lastStr = strTreeSet.last();

        String foxCeiling = strTreeSet.ceiling("Fox");
        String creamCeiling = strTreeSet.ceiling("Cream");
        String foxFloor = strTreeSet.ceiling("Cream");
        String diceFloor = strTreeSet.ceiling("Fox");

        int pollFirst1 = intTreeSet.pollFirst();
        int pollFirst2 = intTreeSet.pollFirst();
        int pollLast1 = intTreeSet.pollLast();
        int pollLast2 = intTreeSet.pollLast();

        Set<String> strTreeSetDesc
                = strTreeSet.descendingSet();


    }
}
