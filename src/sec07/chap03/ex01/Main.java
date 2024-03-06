package sec07.chap03.ex01;

import sec05.chap08.ex01.YalcoChicken;

public class Main {
    public static void main(String[] args) {
        int randNum = pickRandom(123, 456);
        boolean randBool = pickRandom(true, false);
        String randStr = pickRandom("마루치", "아라치");

        YalcoChicken  store1 = new YalcoChicken("판교");
        YalcoChicken  store2 = new YalcoChicken("역삼");
        YalcoChicken randStore = pickRandom(store1, store2);

        double randDbl = pickRandom(12,34);

        var array1 = new Double[]{1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8};
        var array2 = new Character[] {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'
        };

        arraySwap(array1, 3,5);
        arraySwap(array2, 2,7);
        for (var i = 0; i < 100; i++) {
            arraySwap(
                    array2,
                    (int) Math.floor(Math.random() * array2.length),
                    (int) Math.floor(Math.random() * array2.length)
            );
        }

    }

    public static <T> T pickRandom(T a, T b){
        return Math.random() > 0.5 ? a:b;
    }
    public static <T> void arraySwap(T[] array, int a, int b){
        if(array.length <= Math.max(a,b)) return;
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
