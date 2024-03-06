package sec10.chap06;

import sec09.chap05.Person;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        IntStream.range(0,100)
                .filter(i->i%2==1)
                .findFirst()
                //.filter(i -> i > 100)
                //.findFirst()
                //.findAny()
                .orElse(-1);

        String[] names = {
                "강백호", "서태웅", "채치수", "송태섭", "정대만",
                "윤대협", "변덕규", "황태산", "안영수", "허태환",
                "이정환", "전호장", "신준섭", "고민구", "홍익현",
                "정우성", "신현철", "이명헌", "최동오", "정성구"
        };
        Stream<String> nameStream = Arrays.stream(names);
        Random random = new Random();
        random.setSeed(4);
        var people = nameStream
                .map(name->new Person(  name,
                        random.nextInt(18, 35),
                        random.nextDouble(160, 190),
                        random.nextBoolean() ))
                .sorted()
                .toList();
        var personFromOpt = people.stream()
                .findFirst()
                .orElse(new Person("엄친아", 19, 189.9, false));
    }
}
