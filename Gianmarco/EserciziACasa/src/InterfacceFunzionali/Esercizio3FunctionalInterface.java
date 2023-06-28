package InterfacceFunzionali;
/*
3.Implementa una Function che prende in input una lista
di stringhe e restituisce una nuova lista contenente solo
le stringhe che iniziano con la lettera "A".
 */

import java.util.*;
import java.util.function.Function;

public class Esercizio3FunctionalInterface {
    public static void main(String[] args) {
        /*List<String> listaStringhe = Arrays.asList("acqua", "pane", "latte", "Avocado");

         Function<List<String>, List<String>> function = (stringList) -> {
            List<String> inizianoConA = new ArrayList<>();
            for (String parola : listaStringhe) {
                if (parola.startsWith("a") || parola.startsWith("A")) {
                    inizianoConA.add(parola);
                }
            }
            return inizianoConA;
        };
*/
        List<String> listaStringhe = Arrays.asList("acqua", "pane", "latte", "Avocado");
        listaStringhe = new LinkedList<>(listaStringhe);
        Iterator<String> stringIterator = listaStringhe.iterator();

        Function<List<String>, List<String>> function = (stringList) -> {
          while(stringIterator.hasNext()){
              String next=stringIterator.next();
              if(!next.startsWith("a") && !next.startsWith("A")){
                  stringIterator.remove();
              }
          }
          return stringList;
        };
        System.out.println(function.apply(listaStringhe));
    }
}

