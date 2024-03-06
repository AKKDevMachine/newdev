package sec07.chap02;

public class Ex03 {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf("123");

        int int2 = Integer.parseInt("123");

        int int_123_oct = Integer.parseInt("123", 8);
        int int_123_dec = Integer.parseInt("123", 10);
        int int_123_hex = Integer.parseInt("123", 16);

        //  parseInt(CharSequence, 시작위치, 끝위치, 진수)
        int int3 = Integer.parseInt("1234567", 3, 5, 10);

        String strSample = "Ab가1 .";
        for(var i =0;i<strSample.length();i++){
            Character c = strSample.charAt(i);
            System.out.printf(
                    "[%c] : L: %b, U: %b, L: %b, D: %b, S: %b%n",
                    c,
                    Character.isLetter(c),
                    Character.isUpperCase(c),
                    Character.isLowerCase(c),
                    Character.isDigit(c),
                    Character.isSpaceChar(c)
            );
        }
        String inStr = int1.toString();
        String dblStr = Double.valueOf(3.14).toString();
        String blnStr = ((Boolean) false).toString();
        String chrStr = new Character('A').toString();

        Integer intA = 12345;
        Integer intB = 12345;

        boolean compByOp1 = intA==intB;
        boolean comByEq1 = intA.equals(intB);

        Short srtA = 12345;
        boolean compByOp2 = intA.equals(srtA);

        Byte int1Byt = int1.byteValue();
        Double int1Dbl =int1.doubleValue();

        Integer int4 = 123456789;
        Byte int4Byt = int4.byteValue();

        Float flt1 = 1234.5678f;
        Integer flt1Int = flt1.intValue(); // ⚠️ 소수점 이하 버림
        Short int1DblSrt = int1Dbl.shortValue();


    }
}
