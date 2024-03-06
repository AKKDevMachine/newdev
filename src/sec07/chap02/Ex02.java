package sec07.chap02;

public class Ex02 {
    public static void main(String[] args) {
        int intPrim1 = 123;
        Integer intInst1 = Integer.valueOf(intPrim1);

        char chrPrim1 = 'A';
        Character chrInst1 = Character.valueOf(chrPrim1);

        Double dblInst1 = Double.valueOf(3.14);
        double dblPrim1 = dblInst1.doubleValue();

        Boolean blnInst1 = Boolean.valueOf(true);
        boolean blnPrim1 = blnInst1.booleanValue();

        Integer intInst2 = 234;
        Double dlbInst2 = 1.414231;
        char chrPrim2 = Character.valueOf('B');
        boolean blnPrim2 = Boolean.valueOf(true);

        int intPrim2 = intPrim1 + intInst2;
        Integer intInst3 = intPrim2 + intInst2;
        Integer intInst4 = add(3,5);
    }

    static int add(Integer a, Integer b) { return a + b; }
}
