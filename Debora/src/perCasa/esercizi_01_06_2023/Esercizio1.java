package perCasa.esercizi_01_06_2023;

//1.Implementa un Consumer che prende in input una lista di stringhe e le modifica, sostituendo ogni stringa con
// la sua versione in maiuscolo.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Esercizio1 {

    public static void main(String[] args) {

        List<String> listaStringhe = Arrays.asList("fagioli", "patate", "carote", "bieta", "pomodori");
        Consumer<String> consumer = (ortaggi)->{
            System.out.println(ortaggi.toUpperCase());
        };

        listaStringhe.forEach(consumer);
    }
}
