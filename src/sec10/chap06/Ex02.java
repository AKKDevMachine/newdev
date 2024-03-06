package sec10.chap06;

import sec07.chap04.Knight;
import sec07.chap04.MagicKnight;
import sec07.chap04.Side;
import sec07.chap04.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;


public class Ex02 {
    public static void main(String[] args) {
        Optional<String> catOpt = Optional.of("Cat");
        //catOpt = Optional.of(null);
        Optional<String> dogOpt = Optional.ofNullable("Dog");
        Optional<String> cowOpt = Optional.ofNullable(null);
        Optional<String> henOpt = Optional.empty();
        catOpt=getCatOpt();

        List<Optional<Unit>> randomUnitOpts = new ArrayList<>();
        IntStream.range(0, 20)
                .forEach(i -> randomUnitOpts.add(randomUnitOpt()));
        randomUnitOpts.stream()
                .forEach(opt-> System.out.println(opt.isPresent()));
        System.out.println("\n- - - - -\n");
        randomUnitOpts.stream()
                .forEach(opt->opt.ifPresent(unit-> System.out.println(unit)));
        System.out.println("\n- - - - -\n");
        List<Optional<Integer>> optInts = new ArrayList<>();
        IntStream.range(0,20)
                .forEach(i->optInts.add(Optional.ofNullable(
                        new Random().nextBoolean()?i:null
                )));

        optInts.stream()
                .forEach(opt -> {
                    System.out.println(
                            opt
                                    //  ⭐️ 걸러진 것은 null로 인식됨
                                    //  - 스트림의 filter처럼 건너뛰는 것이 아님!
                                    .filter(i -> i % 2 == 1)
                                    .map(i -> "%d 출력".formatted(i))
                                    .orElse("(SKIP)")
                    );
                });

    }
    public static Optional<String> getCatOpt(){
        return Optional.ofNullable(new Random().nextBoolean()?"Cat":null);
    }
    public static Optional<Unit> randomUnitOpt(){
        switch (new Random().nextInt(0,3)){
            case 0 : return Optional.of(new Knight(Side.BLUE));
            case 1 : return Optional.of(new MagicKnight(Side.BLUE));
            default: return Optional.empty();
        }
    }
}
