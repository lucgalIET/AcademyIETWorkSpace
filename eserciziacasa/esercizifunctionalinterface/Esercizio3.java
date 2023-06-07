package eserciziacasa.esercizifunctionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Esercizio3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Aoh", "oah", "brr", "anglofono", "skrt");

        Function<List<String>, List<String>> function = (stringList) -> {
            List<String> outputList = new ArrayList<>();
            for (String s : stringList) {
                if (s.startsWith("A")) outputList.add(s);
            }
            return outputList;
        };

        System.out.println(function.apply(strings));

        strings.stream().filter(x -> x.startsWith("A") || x.startsWith("a")).forEach(System.out::println);
    }
}
