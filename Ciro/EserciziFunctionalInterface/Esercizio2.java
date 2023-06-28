package Ciro.EserciziFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
/*
Implementa un Supplier che genera una sequenza di numeri interi casuali e restituisce la somma di questi numeri.
 */
public class Esercizio2 {
    private static int somma = 0;

    public static void main(String[] args) {

//            Supplier<Integer> supplier = () -> {
//                Random random = new Random();
//                int n = random.nextInt(1,10);
//                int somma = 0;
//                for (int i = 0; i < n; i++) somma += random.nextInt(100);
//                return somma;
//            };
//
//            System.out.println(supplier.get());

        // versione con stream

        Supplier<List<Integer>> supplier = ()->{
            Random random = new Random();
           List<Integer> listaNumeri = new ArrayList<>();

            for(int i = 0; i < 10; i++){
                listaNumeri.add(random.nextInt(1,1000));
            }
            return listaNumeri;
        };


        supplier.get().stream().forEach(x ->  somma += x);
        System.out.println(somma);
    }

}
