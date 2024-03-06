package sec06.chap08;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import java.util.StringJoiner;

public class Ex01 {
    public static void main(String[] args) {
        //Math math = new Math();

        double e = Math.E;
        double pi = Math.PI;

        int absInt = Math.abs(-5);
        double absDbl = Math.abs(-3.14);

        double ceil = Math.ceil(2.34);
        double fllor = Math.floor(4.56);
        double round1 = Math.round(2.34);
        double round2 = Math.round(4.56);

        int largerInt = Math.max(2,3);
        float smallerFlt = Math.min(1.2f, 3.4f);

        //  제곱
        double pow1 = Math.pow(4, 3); // double을 받지만 묵시 형변환
        double pow2 = Math.pow(4, 0.5);

        double rand1 = Math.random();
        double rand2 = Math.random();
        double rand3 = Math.random();

        int _1to10_1 = (int) Math.ceil(Math.random()*10);
        int _1to10_2 = (int) Math.ceil(Math.random()*10)+1;

        int add1 = Math.addExact(2_147_483_645, 1);
        int add2 = 2_147_483_145 + 1;

        Random random = new Random();

        int randInt1 = random.nextInt();
        int randInt2 = random.nextInt();
        int randInt3 = random.nextInt();

        int randInt4 = random.nextInt(0, 10);
        int randInt5 = random.nextInt(0, 10);
        int randInt6 = random.nextInt(0, 10);

        double randDbl1 = random.nextDouble();
        double randDbl2 = random.nextDouble();
        // 범위 지정 (이상, 미만)
        double randDbl3 = random.nextDouble(3.14, 5.67);
        double randDbl4 = random.nextDouble(3.14, 5.67);

        boolean randBln1 = random.nextBoolean();
        boolean randBln2 = random.nextBoolean();

        long maxLong = Long.MAX_VALUE;

        BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");

        BigInteger bigInt3 = bigInt1.add(bigInt2);
        BigInteger bigInt4 = bigInt2.subtract(bigInt1);
        BigInteger bigInt5 = bigInt1.multiply(bigInt2);
        BigInteger bigInt6 = bigInt2.divide(bigInt1);

        int bigIntCompare1 = bigInt1.compareTo(bigInt2);
        int bigIntCompare2 = bigInt2.compareTo(bigInt1);

        var num1 = 0.2 + 0.3f;
        var num2 = 0.3f * 0.7f;
        var num3 = 0.4 - 0.3;
        var num4 = 0.9f / 0.3;
        var num5 = 0.9 % 0.6;

        var num6 = new BigDecimal("0.2").add(new BigDecimal("0.3"))
                .floatValue();

        var num7 = new BigDecimal("0.3")
                .multiply(new BigDecimal("0.7"))
                .floatValue();

        var num8 = new BigDecimal("0.4")
                .subtract(new BigDecimal("0.3"))
                .floatValue();

        var num9 = new BigDecimal("0.9")
                .divide(new BigDecimal("0.3"))
                .doubleValue();

        var num10 = new BigDecimal("0.9")
                .remainder(new BigDecimal("0.6"))
                .doubleValue();

        String[] strAry = { "감자", "당근", "오이", "양파" };
        StringJoiner strJnr1 = new StringJoiner(",", "<", ">");
        StringJoiner strJnr2 = new StringJoiner(" / ", "{{ ", " }}");

        for (var s : strAry) {
            strJnr1.add(s);
            strJnr2.add(s);
        }

        String joined1 = strJnr1.toString();
        String joined2 = strJnr2.toString();

        var strBffr1 = new StringBuffer(); // 기본: 16
        var strBffr2 = new StringBuffer(2); // int로 다른 값 지정 가능
        var strBffr3 = new StringBuffer("Hello"); // 문자열 길이 + 16
        strBffr1.append("안녕하세요~!");
        strBffr2.append("안녕하세요~!");
        strBffr3.append("안녕하세요~!12314124124124124124");
        int[] capacities2 = {
                strBffr1.capacity(), strBffr2.capacity(), strBffr3.capacity()
        };

        String strBffr3Out = strBffr3.toString();

        //  StringBuilder도 동일한 기능들 가짐
        var strBldr1 = new StringBuilder("한놈");
        strBldr1.append("두시기");

        //  append 메소드는 해당 클래스의 인스턴스 반환
        //  - 메소드 체이닝 가능
        strBldr1
                .append("석삼")
                .append("너구리")
                .append("다섯놈");

        var strBldr1Out = strBldr1.toString();
        var strBldr2 = new StringBuilder("0123456789");

        var strBldr2Out1 = strBldr2 // 범위의 문자열 지움
                .delete(3, 7).toString();

        var strBldr2Out2 = strBldr2 // 위치의 문자열 삭제
                .deleteCharAt(3).toString();

        var strBldr2Out3 = strBldr2 // 위치에 문자열 추가
                .insert(2, "ABC").toString();

        var strBldr2Out4 = strBldr2 // 범위의 문자열을 치환
                .replace(2, 4, "OneTwo").toString();

        var strBldr2Out5 = strBldr2 // 문자열 뒤집음
                .reverse().toString();

        //  메서드 체이닝으로 한 번에
        var strBldr2ChainOut = new StringBuilder("0123456789")
                .delete(3, 7)
                .deleteCharAt(3)
                .insert(2, "ABC")
                .replace(2, 4, "OneTwo")
                .reverse()
                .toString();
        var strBldr3 = new StringBuilder("ABCDEFG");

        //  수동으로 저장공간 늘려주기
        //  - 작업할 전체 용량이 초기화 이후 계산되었을 때 유용
        //strBldr3.setLength(100);
        var strBldr3Cap = strBldr3.capacity();

        //  주어진 범위만 문자열로 반환
        String strBldr3Substr = strBldr3.substring(2, 5);

        //  ⭐️ CharSequence 인터페이스
        //  - String, StringBuffer, StringBuilder 모두 이를 구현
        //  - Integer.parseInt 등의 메서드에 인자 타입으로 널리 사용
        //  - 메소드들 살펴볼 것

        CharSequence cs1 = "ABC";
        CharSequence cs2 = new StringBuffer();
        CharSequence cs3 = new StringBuilder();


    }
}
