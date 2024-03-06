package sec07.chap02;

public class Ex01 {
    public static void main(String[] args) {
        int int1 = 123;
        double dbl1 = 3.14;
        char chr1 = 'A';
        boolean bln1 = true;

        Integer int2 = new Integer(123);
        Double dbl2 = new Double(3.14);
        Character chr2 = new Character('A');
        Boolean bln2 = new Boolean(true);

        Integer int3 = Integer.valueOf(123);
        Double dbl3 = Double.valueOf(3.14);
        Character chr3 = Character.valueOf('A');
        Boolean bln3 = Boolean.valueOf(true);

        Number num1 = int1;
        Number num2 = dbl1;
    }

}
