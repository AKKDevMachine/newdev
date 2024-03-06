package sec09.chap04;

import sec07.chap04.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        Integer[] integerAry = {1,2,3,4,5};
        Stream<Integer> fromArray = Arrays.stream(integerAry);
        var fromArray_Arr = fromArray.toArray();

        int[] intAry={1,2,3,4,5};
        IntStream fromIntAry = Arrays.stream(intAry);
        var fromIntAry_Arr = fromIntAry.toArray();
        double[] dblAry ={1.1, 2.2, 3.3};
        DoubleStream fromDblAry = Arrays.stream(dblAry);
        var fromDblAry_Arr = fromDblAry.toArray();

        IntStream withInts = IntStream.of(1,2,3,4,5);
        Stream<Integer> withIntegers = Stream.of(1,2,3,4,5);
        Stream<Unit> withUnits = Stream.of(
                new Swordman(Side.BLUE),
                new Knight(Side.BLUE),
                new MagicKnight(Side.BLUE)
        );
        var withUnits_Arr = withUnits.toArray();
        List<Integer> intAryList = new ArrayList<>(Arrays.asList(integerAry));
        Stream fromColl1 = intAryList.stream();
        var fromColl1_Arr = fromColl1.toArray();

        Map<String, Character> subjectGradeHM = new HashMap<>();
        subjectGradeHM.put("English", 'B');
        subjectGradeHM.put("Math", 'C');
        subjectGradeHM.put("Programming", 'A');
        var fromHashMap_Arr = subjectGradeHM.entrySet().stream().toArray();

        Stream.Builder<Character> builder = Stream.builder();
        builder.accept('스');
        builder.accept('트');
        builder.accept('림');
        builder.accept('빌');
        builder.accept('더');
        Stream<Character> withBuilder = builder.build();
        var withBuilder_Arr = withBuilder.toArray();

        Stream<Integer> toConcat1 = Stream.of(11,22,33);
        Stream<Integer> toConcat2 = Stream.of(44,55,66);
        Stream<Integer> withConcatMethod = Stream.concat(toConcat1,toConcat2);
        var withConcatMethod_Arr = withConcatMethod.toArray();

        Stream<Integer> withIter1 = Stream
                .iterate(0, i->i+2)
                .limit(10);
        var withIter1_Arr=withIter1.toArray();

        Stream<String> withIter2 = Stream
                .iterate("홀", s->s+(s.endsWith("홀")?"짝":"홀"))
                .limit(8);
        var withIter2_Arr = withIter2.toArray();

        IntStream fromRange1 = IntStream.range(10,20);
        IntStream fromRange2 = IntStream.rangeClosed(10,20);
        Stream<Integer> fromRangeBox = fromRange1.boxed();
        var fromRangeBox_Arr=fromRangeBox.toArray();

        IntStream randomInts = new Random().ints(5,0,100);
        var randomInts_Arr = randomInts.toArray();

        DoubleStream randomDbls = new Random().doubles(5, 2, 3);
        var randomDbls_Arr = randomDbls.toArray();

        IntStream fromString = "Hello Wordl".chars();
        var fromString_Arr=fromString.toArray();

        Stream<String> fromFile;
        Path path = Paths.get("./src/sec09/chap04/turtle.txt");
        try {
            fromFile = Files.lines(path);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        var fromFile_Arr = fromFile.toArray();

        Stream<Double> emptyDblSteam = Stream.empty();
    }
}
