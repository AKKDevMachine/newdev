package sec08.chap05.ex01;

import sec07.chap04.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Comparable & Comparator
        // 둘 모두 인터페이스
        // Comparable(비교의 대상) : 자신과 다른 객체를 비교
        // 숫자 클래스들, 불리언, 문자열
        // 이후 배울 Date, BigDecimal, BigInteger 등
        // Comparator(비교의 주체) : 주어진 두 객체를 비교
        // 컬렉션에서는 정렬의 기준으로 사용
        // Arrays의 정렬 메소드, TreeSet이나 TreeMap등의 생성자에 활용

        Integer int1 = Integer.valueOf(1);
        Integer int2 = Integer.valueOf(2);
        Integer int3 = Integer.valueOf(3);

        int _1_comp_3 = int1.compareTo(3);
        int _2_comp_1 = int2.compareTo(1);
        int _3_comp_3 = int3.compareTo(3);
        int _t_comp_f = Boolean.valueOf(true).compareTo(Boolean.valueOf(false));
        int _abc_comp_def = "ABC".compareTo("DEF");
        int _def_comp_abc = "efgh".compareTo("abcd");

        Integer[] nums = {3,8,1,7,4,9,2,6,4};
        String[] strs= {"Fox", "Banana", "Elephant", "Car", "Apple",
        "Game", "Dice"};
        Arrays.sort(nums);
        Arrays.sort(strs);

        Arrays.sort(nums, new IntDescComp());
        Arrays.sort(nums, new CloseToInt(5));

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        ArrayList<Integer> numsAry = new ArrayList<>(Arrays.asList(nums));
        numsAry.sort(new IntDescComp());
        numsAry.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1%2)-(o2%2);
            }
        });

        TreeSet<Unit> unitTSet = new TreeSet<>(new UnitSorter());
        for(var u : new Unit[]{
            new Knight(Side.BLUE),
                new Knight(Side.BLUE),
                new Swordman(Side.RED),
                new Swordman(Side.RED),
                new MagicKnight(Side.BLUE),
                new Swordman(Side.BLUE),
                new MagicKnight(Side.RED),
                new Knight(Side.RED)

        }){
            unitTSet.add(u);
        }


    }
}
