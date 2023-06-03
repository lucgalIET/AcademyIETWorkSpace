package eserciziPerCasa.EserciziFunctionalInterface.EserciziInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Esercizio1 {
    public static void main(String[] args) {
/*Implementa un Consumer che prende in input una lista di stringhe e le modifica,
sostituendo ogni stringa con la sua versione in maiuscolo.
*/
        List<String> listaString = Arrays.asList("buongorno", "sono ","una", "lista", "di", "stringhe");

        for(String elem: listaString){
            System.out.print(elem + " ");
        }

        Consumer<String> consumer = (strings) -> System.out.print(strings.toUpperCase() + " ");
        System.out.println();
        listaString.forEach(consumer);
    }
}



