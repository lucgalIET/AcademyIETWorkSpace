package perCasa.Esercizi_01_06_2023;

import java.util.Random;
import java.util.function.Supplier;

//2.Implementa un Supplier che genera una sequenza di numeri interi casuali e restituisce la somma di questi numeri.
public class Esercizio2 {

    public static void main(String[] args) {

        Supplier<Integer> supplier = () ->{
            int somma = 0;
            for(int i = 0; i < 10; i++){
                Random random = new Random();
                somma += random.nextInt(101);
            }
            return somma;
        };

        System.out.println(supplier.get());
    }
}
