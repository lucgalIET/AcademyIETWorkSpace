package EserciziACasa.EserciziFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Esercizio1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ciao","hola","hi","salut");

        Consumer<String> consumer = (string) -> strings.set(strings.indexOf(string),string.toUpperCase());
        strings.forEach(consumer);

        System.out.println(strings);
    }
}
