package perCasa.esercizi_01_06_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

//2.Implementa un Supplier che genera una sequenza di numeri interi casuali e restituisce la somma di questi numeri.
public class Esercizio2 {

    private static int somma = 0;
    public static void main(String[] args) {

        List<Integer> listaInteri = new ArrayList<>();


        Supplier<List<Integer>> supplier = () ->{
            for(int i = 0; i < 10; i++){
                Random random = new Random();
                listaInteri.add(random.nextInt(101));
            }
            return listaInteri;
        };

        List<Integer> listaCasuale = supplier.get();

        //System.out.println(supplier.get());

        listaCasuale.forEach(x->somma+=x);
        System.out.println(somma);
    }
}
