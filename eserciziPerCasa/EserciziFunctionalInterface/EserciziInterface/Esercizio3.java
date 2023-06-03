package eserciziPerCasa.EserciziFunctionalInterface.EserciziInterface;
/*
Implementa una Function che prende in input una lista di stringhe e restituisce una nuova lista
contenente solo le stringhe che iniziano con la lettera "A".
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

    public class Esercizio3 {

        public static void main(String[] args) {
            List<String> listaString = Arrays.asList("Andrea", "ciao", "Domani", "Adesso","allora");
            Consumer<String> consumer = (strings)-> System.out.println(strings);

            Function<String, String> function = (strings)->{
                String parola = "";
                if(strings.startsWith("A"))
                    parola = strings;
                return parola;

            };

            listaString.stream().map(function).forEach(consumer);
        }
}

