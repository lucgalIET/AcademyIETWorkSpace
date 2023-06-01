package perCasa.Esercizi_01_06_2023;


//3.Implementa una Function che prende in input una lista di stringhe e restituisce
// una nuova lista contenente solo le stringhe che iniziano con la lettera "A".

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Esercizio3 {

    public static void main(String[] args) {

        List<String> listaNomi = Arrays.asList("Alberto", "Pino", "Alcide", "Matteo", "Ettore", "Claudio", "Attilio", "Anacleto");

        Function<String, List<String>> function = (listaStringhe) -> {
            List<String> listaRisultante = new ArrayList<>();

            if (listaStringhe.startsWith("A")) {
                listaRisultante.add(listaStringhe);
            }

            return listaRisultante;
        };

        Consumer<List<String>> consumer = (nomi) -> {
            for(String elem: nomi){
                System.out.println(elem);
            }
        };

        listaNomi.stream().map(function).forEach(consumer);
    }

}
