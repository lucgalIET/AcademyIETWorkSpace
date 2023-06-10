package EserciziCasa_04_06_23;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Esercizio3FunctionalInterface {
    public static void main(String[] args) {
        List<String> listaStringhe = Arrays.asList("acqua", "pane", "latte", "avocado");

        Function<List<String>, List<String>> function = (stringList) -> {
            List<String> inizianoConA = new ArrayList<>();
            for (String parola : listaStringhe) {
                if (parola.startsWith("a") || parola.startsWith("A")) {
                    inizianoConA.add(parola);
                }

            }
            return inizianoConA;

        };

        System.out.println(function.apply(listaStringhe));

    }
}
