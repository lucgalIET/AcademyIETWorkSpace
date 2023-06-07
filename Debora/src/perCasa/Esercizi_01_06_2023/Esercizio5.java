package perCasa.Esercizi_01_06_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Flow;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

//5.Combina le interfacce funzionali Consumer, Supplier, Function e Runnable per implementare un programma che genera
// una sequenza di numeri casuali, li filtra prendendo solo quelli pari, li eleva al quadrato e li stampa.
public class Esercizio5 {

    public static void main(String[] args) {


        Runnable runnable = System.out::println;

        Function<Integer, List<Integer>> function = (listaNumeri) -> {
            List<Integer> listaPari = new ArrayList<>();
            if (listaNumeri.intValue() % 2 == 0) {
                listaPari.add(listaNumeri.intValue());
            }
            return listaPari;
        };

        Supplier<List<Integer>> supplier = () -> {
            List<Integer> listaNumeriCasuali = new ArrayList<>();
            Random random = new Random();
            int numero;
            for (int i = 0; i < 20; i++) {
                numero = random.nextInt(101);
                listaNumeriCasuali.add(numero);
            }
            return listaNumeriCasuali;
        };

        Consumer<List<Integer>> consumer = (List<Integer> listaNumeri) -> {
            int numero;
            for (Integer elem : listaNumeri) {
                System.out.println("Numero: " + elem + " Quadrato: " + ((int) Math.pow(elem, 2)));
            }
        };

        //runnable.run();


        supplier.get().stream().filter(x->x%2 == 0).map(x->(int)Math.pow(x,2)).forEach(System.out::println);
    }

}
