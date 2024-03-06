package sec08.chap02;

import sec07.chap04.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints1 =new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        ArrayList<Knight> knights = new ArrayList<>();

        ints1.add(11);
        ints1.add(22);
        ints1.add(33);
        ints1.add(44);
        ints1.add(55);

        for(var str : "바니 바니 바니 바니 당근 당근".split(" ")){
            strings.add(str);
        }
        for(int i : ints1){
            System.out.println(i);
        }
        int ints1Size = ints1.size();
        boolean ints1IsEmpty = ints1.isEmpty();
        int ints12nd = ints1.get(1);
        boolean intsCon3 = ints1.contains(33);
        boolean intsCon6 = ints1.contains(66);

        ints1.set(2,444);
        ints1.add(0,11);
        ArrayList<Integer> ints2A = new ArrayList<>(
                Arrays.asList(1,2,3,4,5)
        );
        ArrayList<Integer> ints2B = new ArrayList<>(
                List.of(1,2,3,4,5)
        );
        ArrayList<Integer> ints2C = new ArrayList<>();
        Collections.addAll(ints2C, 1,2,3,4,5);

        ArrayList<Integer> ints3 = new ArrayList<>(ints1);
        ArrayList<Integer> ints4 = (ArrayList<Integer>) ints3.clone();
        boolean t1 = ints1 == ints3;
        boolean t2 = ints4 == ints3;
        boolean t3 = ints4 == ints1;

        ints3.remove(4);
        ints3.remove((Integer) 55);
        ints1.removeAll(ints3);
        ints1.addAll(ints3);

        Object[] intsAry2_Obj= ints1.toArray();
        Integer[] intsAry2=ints1.toArray(Integer[]::new);

        ints1.clear();

        numbers.add(Integer.valueOf(123));
        numbers.add(3.14);

        knights.add(new Knight(Side.BLUE));
        knights.add(new Knight(Side.RED));

        ArrayList<? extends Knight> eliteSquad;
        //eliteSquad = new ArrayList<Swordman>();
        eliteSquad = new ArrayList<Knight>();
        eliteSquad = new ArrayList<MagicKnight>();

        Knight knight1 = new Knight(Side.RED);
        knights.add(knight1);

        boolean removed1 = knights.remove(new Knight(Side.RED));
        boolean removed2 = knights.remove(knight1);

        ArrayList<Attacker> attackers = new ArrayList<>();
        attackers.ensureCapacity(5);
        attackers.trimToSize();

        LinkedList<Integer> intNums = new LinkedList<>();

        for(var intNum : new int[]{2,3,4}) intNums.add(intNum);
        intNums.addFirst(1);
        intNums.addFirst(0);
        intNums.addLast(5);
        intNums.addLast(6);

        int peekedFirst = intNums.peekFirst();
        int gottenFirst = intNums.getFirst();
        int peekedLast = intNums.peekLast();
        int gottenLast = intNums.getLast();

        int polledFirst = intNums.pollFirst();
        int removeSecond = intNums.removeFirst();
        int polledLast = intNums.pollLast();
        int removedLast = intNums.removeLast();

        LinkedList<Character> charLList = new LinkedList<>();
        charLList.push('A');
        charLList.push('B');
        charLList.push('C');
        charLList.push('D');
        charLList.push('E');

        char pop1 = charLList.pop();
        char pop2 = charLList.pop();
        char pop3 = charLList.pop();

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        var list1Type = list1.getClass().getName();
        var list2Type = list2.getClass().getName();

        

    }
}
