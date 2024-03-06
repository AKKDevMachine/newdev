package sec09.chap04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> int0To9 = new ArrayList<>(
                Arrays.asList(5, 2, 0, 8, 4, 1, 7, 9, 3, 6));
        List<Integer> odds = new ArrayList<>();
        for(var i : int0To9){
            if(i%2==1) odds.add(i);
        }
        odds.sort(Integer::compare);
        List<String> oddsStrs = new ArrayList<>();
        for(var i : odds){
            oddsStrs.add(String.valueOf(i));
        }
        var oddsStr = String.join(",",oddsStrs);

        var oddsStrtStreamed = int0To9
                .stream()
                .filter(i->i%2==1)
                .sorted(Integer::compare)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

    }
}
