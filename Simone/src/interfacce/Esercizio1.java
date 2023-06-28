package interfacce;

import java.util.Arrays;
import java.util.List;

public class Esercizio1 {
        public static void main(String[] args) {
//1.Implementa un Consumer che prende in input una lista di stringhe e le modifica, sostituendo ogni stringa con la sua versione in maiuscolo.

        /*    List<String> listString= Arrays.asList("ciao", "a","tutti");

            Consumer<String> consumer=(strings)->{
                System.out.println(strings.toUpperCase());

            };
            listString.forEach(consumer);*/

            List<String> listString= Arrays.asList("ciao", "a","tutti");

            listString.stream().
                    map(String::toUpperCase)
                    .forEach(System.out::println);

        }
    }
