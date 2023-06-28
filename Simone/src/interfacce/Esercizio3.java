package interfacce;

import java.util.Arrays;
import java.util.List;

public class Esercizio3 {
    public static void main(String[] args) {
        //3.Implementa una Function che prende in input una lista di stringhe e restituisce una nuova lista contenente solo le stringhe che iniziano con la lettera "A".
        List<String> listString2= Arrays.asList("Andiamo", "ciao", "Domani", "Adesso","Allora");

       /* Consumer<List <String>> consumer2=(strings)-> {
            for (String s : strings) {
                System.out.println(s);
            }
        };
        Function<String, List <String>> function=(strings)->{

            List<String> listaParoleA=new ArrayList<>();
            if(strings.startsWith("A")){
                listaParoleA.add(strings);
            }
            return listaParoleA;
        };

        listString2.stream().map(function).forEach(consumer2);

        */
        listString2.stream()
                .filter(x-> x.startsWith("A"))
                .forEach(System.out::println);

    }
}
