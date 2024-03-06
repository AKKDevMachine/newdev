package sec09.chap03;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> intToStrLD = i -> String.valueOf(i);
        Function<Integer, String> intToStrMR = String::valueOf;
        var intTostr = intToStrMR.apply(123);

        UnaryOperator<String> toLCaseLD = s -> s.toLowerCase();
        UnaryOperator<String> toLCaseMR = String::toLowerCase;
        var toLCase = toLCaseMR.apply("HELLO");

        Function<String, Button> strToButtonLD=s->new Button(s);
        Function<String, Button> strToButtonMR = Button::new;
        Button button1 = strToButtonMR.apply("Dog");

        BiFunction<String, String, Button> twoStrToButtonLD =(s1,s2)->
                new Button(s1,s2);
        BiFunction<String, String, Button> twoStrToButtonMR =
                Button::new;
        Button button2 = twoStrToButtonMR.apply("고양이", "야옹");
        button2.onClick();
        System.out.println("\n-----------------------\n");
        Runnable catCryLD = ()->button2.onClick();
        Runnable catCryMR = button2::onClick;
        catCryMR.run();

        TreeSet<String> treeSetLD = new TreeSet<>((s1,s2)->
                s1.compareTo(s2));
        TreeSet<String> treeSetMR = new TreeSet<>(String::compareTo);

    }
}
