package sec11.chap08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        Stream<Character> stream1 = Stream.of('A', 'B', 'C');
        boolean bool1 = stream1.isParallel();

        stream1.parallel();
        boolean bool2 = stream1.isParallel();

        stream1.sequential();
        boolean bool3 = stream1.isParallel();

        Stream<Integer> stream2 = Arrays.asList(1,2,3,4,5).parallelStream();

        List<Double> dblList = new ArrayList<>(Arrays.asList(1.23, 2.34, 3.45));
        Stream<Double> stream3 = dblList.parallelStream();
    }
}
