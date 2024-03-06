package sec08.chap04;

import sec07.chap04.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Map<Integer, String> numNameHMap = new HashMap<>();
       numNameHMap.put(1, "홍길동");
       numNameHMap.put(2, "전우치");
       numNameHMap.put(3, "임꺽정");

       Map<String, Double> nameHeightHMAp = new HashMap<>();
       nameHeightHMAp.put("김철수", 176.8);
       nameHeightHMAp.put("이장신", 187.4);
       nameHeightHMAp.put("박숏달", 152.3);
       nameHeightHMAp.put("정기준", 171.2);

       Map<Side, ArrayList<Unit>> sideUnitsHMap = new HashMap<>();
       sideUnitsHMap.put(
               Side.BLUE, new ArrayList<>(Arrays.asList(
                       new Swordman(Side.BLUE),
                       new Knight(Side.BLUE),
                       new MagicKnight(Side.BLUE)
               ))
       );
       sideUnitsHMap.put(
               Side.RED, new ArrayList<>(Arrays.asList(
                       new Knight(Side.RED),
                       new Knight(Side.RED),
                       new Knight(Side.RED)
               ))
       );
       Map<Integer, String> numNameHMapClone = new HashMap<>();
       numNameHMapClone.putAll(numNameHMap);
       String no2 = numNameHMap.get(2);
       Double leeHeight = nameHeightHMAp.get("이장신");
       String wrong1 = numNameHMap.get(0);
       String wrong2 = numNameHMap.get(3);

       Set<Integer> numSet = numNameHMap.keySet();
       Set<Integer> numHSet = new HashSet<>();
       numHSet.addAll(numSet);

       for(var n : numNameHMap.keySet()){
           System.out.println(numNameHMap.get(n));
       }
       for(var side : sideUnitsHMap.keySet()){
           for(var unit : sideUnitsHMap.get(side)){
               System.out.println(unit);
           }
       }

       boolean contains1 = nameHeightHMAp.containsKey("박숏달");
       boolean contains2 = nameHeightHMAp.containsKey("장롱달");
       boolean contains3 = nameHeightHMAp.containsValue(171.2);

       System.out.printf("\n- - - - -\n");

       Map<Attacker, Horse> atkrHrsHMap = new HashMap<>();
       Swordman kenshin = new Swordman(Side.RED);
       Knight lancelot = new Knight(Side.BLUE);

       atkrHrsHMap.put(kenshin, new Horse(40));
       atkrHrsHMap.put(lancelot, new Horse(50));
       atkrHrsHMap.put(new MagicKnight(Side.BLUE), new Horse(50));

       Horse kenshinHorse = atkrHrsHMap.get(kenshin);
       Horse lancelotHorse = atkrHrsHMap.get(lancelot);
       Horse wrongHorse = atkrHrsHMap.get(new MagicKnight(Side.BLUE));

       for(var u : atkrHrsHMap.keySet()){
           System.out.println(u + " : " + atkrHrsHMap.get(u));
       }
       String defName = numNameHMap.getOrDefault(10,"김태리");
       Horse defHorse = atkrHrsHMap.getOrDefault(new MagicKnight(Side.BLUE), new Horse(40));

       Set<Map.Entry<Integer, String>> numNameES = numNameHMap.entrySet();
       for(var entry : numNameES){
           int key = entry.getKey();
           String value = entry.getValue();
           System.out.printf("k: %d, v: %s%n", key, value);
           System.out.println(entry);
       }
       numNameHMap.remove(1);
       numNameHMap.remove(2,"황대장");
       boolean isEmpty1 = nameHeightHMAp.isEmpty();
       nameHeightHMAp.clear();
       boolean isEmpty2 = nameHeightHMAp.isEmpty();

       TreeMap<Integer, String[]> classKidsTMap = new TreeMap<>();
        classKidsTMap.put(3, new String[] {"서아", "이준", "아린"});
        classKidsTMap.put(9, new String[] {"하윤", "서준", "지호"});
        classKidsTMap.put(1, new String[] {"이서", "하준", "아윤"});
        classKidsTMap.put(7, new String[] {"지안", "은우", "예준"});
        classKidsTMap.put(5, new String[] {"서윤", "시우", "하은"});

        int firstKey = classKidsTMap.firstKey();
        int lastKey = classKidsTMap.lastKey();

        Map.Entry<Integer, String[]> fristEntry = classKidsTMap.firstEntry();
        Map.Entry<Integer, String[]> lastEntry = classKidsTMap.lastEntry();

        int ceil4 = classKidsTMap.ceilingKey(4);
        Map.Entry<Integer, String[]> floor4 = classKidsTMap.floorEntry(4);
        Map.Entry<Integer, String[]> pollF1 = classKidsTMap.pollFirstEntry();
        Map.Entry<Integer, String[]> pollF2 = classKidsTMap.pollFirstEntry();
        Map.Entry<Integer, String[]> pollL1 = classKidsTMap.pollLastEntry();
        Map.Entry<Integer, String[]> pollL2 = classKidsTMap.pollLastEntry();


    }
}
