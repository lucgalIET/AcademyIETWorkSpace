package EserciziCasa_04_06_23;
/*5.Combina le interfacce funzionali Consumer, Supplier, Function e Runnable
        per implementare un programma che genera una sequenza di numeri casuali,
        li filtra prendendo solo quelli pari, li eleva al quadrato e li stampa.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class Esercizio5FunctionalInterface {
    public static void main(String[] args) {
        Random random = new Random();

        Supplier generaNumeri = () -> {
            List<Integer> listaNumeri = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                listaNumeri.add(random.nextInt(20));
            }
            return listaNumeri;
        };
        List<Integer> numeriGenerati = (List<Integer>) generaNumeri.get();
        System.out.println(numeriGenerati);

        Function<List<Integer>, List<Integer>> estraiPari = (integerList) -> {
            List<Integer> listaPari = new ArrayList<>();
            for (int num : numeriGenerati) {
                if (num % 2 == 0) {
                    listaPari.add(num);
                }

            }
            return listaPari;
        };
        List<Integer> listaPari = estraiPari.apply(numeriGenerati);
        System.out.println(listaPari);

        Function<List<Integer>, List<Integer>> elevaNumeri = (integerList) -> {
            List<Integer> listaNumeriElevati = new ArrayList<>();
            for (int num : listaPari) {
                listaNumeriElevati.add(num * num);
            }
            return listaNumeriElevati;
        };

        // non utilizzo consumer perchè così potremmo proseguire con altre operazioni
        //consumer potrebbe fare solo la stampa e basta

        System.out.println(elevaNumeri.apply(listaPari));

    }

}
