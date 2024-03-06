package sec09.chap05;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        IntStream.range(1,100)
                .filter(i->i%2==0)
                .skip(10)
                .limit(10)
                .map(i->i*10)
                .forEach(System.out::println);
        System.out.println("\n- - - - -\n");
        String str1 = "Hello World! Welcome to the world of Java~";
        str1.chars().forEach(System.out::println);
        System.out.println("\n- - - - -\n");
        char str1MaxChar = (char) str1.chars()
                .max()
                .getAsInt();
        str1.chars()
                .forEach(i-> System.out.print((char) i));
        System.out.println("\n- - - - -\n");
        var fromStr1 = str1.chars().boxed()
                .map(i->String.valueOf((char) i.intValue()))
                .collect(Collectors.joining(", "));
        System.out.println("\n- - - - -\n");
        var oddSquaresR = IntStream.range(0,10).boxed()
                .peek(i-> System.out.println("초기값: "+i))
                .filter(i->i%2==1)
                .peek(i-> System.out.println("홀수만: "+i))
                .map(i->i*i)
                .peek(i-> System.out.println("제곱: "+i))
                .sorted((i1,i2)->i1<i2?1:-1)
                .peek(i-> System.out.println("역순; "+i))
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        Integer[] ints = {1,2,3,4,5,6,7,8,9};
        boolean intsMatch= Arrays.stream(ints)
                .allMatch(i->i>0);
        System.out.println("\n- - - - -\n");
        long afterWhileOp = Arrays.stream(ints)
                .takeWhile(i->i<4)
                .peek(System.out::println)
                .count();
        int intsSum = IntStream.range(0,100+1)
                .sum();
        System.out.println("\n- - - - -\n");
        double doubleSum = DoubleStream.iterate(3.14, i->i*2)
                .limit(10)
                .peek(System.out::println)
                .sum();
        System.out.println("\n- - - - -\n");

        int intReduce = IntStream.range(1,10)
                .reduce((prev,curr)->{
                    System.out.printf("prev: %d, cur: %d%n",prev,curr);
                    return prev*curr;
                })
                .getAsInt();
        int intReduceWithSeed = IntStream.range(1,10)
                .reduce(2,(prev, curr)->{
                    System.out.printf("prev: %d, cur: %d%n", prev, curr);
                    return prev*curr;});

        StringStat stringStat = "Hello World! Welcome to the world of Java~"
                .chars()
                .boxed()
                .reduce(
                        new StringStat(),
                        (ss, i) -> {
                            ss.length++;
                            if (i >= 'A' && i <= 'Z') { ss.upperCases++; }
                            else if (i >= 'a' && i <= 'z') { ss.lowerCases++; }
                            else { ss.nonLetters++; }
                            return ss;
                        },
                        //  아래의 combiner 인자는 병령 연산에서만 작용 (여기서는 무의미)
                        //  요소와 다른 타입을 반환하는 오버로드의 필수인자이므로 임의로 넣음
                        (ss1, ss2) -> ss1
                );



    }

    public static class StringStat{
        int length=0;
        int upperCases=0;
        int lowerCases=0;
        int nonLetters=0;
    }
}
