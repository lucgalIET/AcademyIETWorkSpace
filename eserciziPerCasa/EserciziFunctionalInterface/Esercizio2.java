package eserciziPerCasa.EserciziFunctionalInterface;

import java.util.Random;
import java.util.function.Supplier;
/*
Implementa un Supplier che genera una sequenza di numeri interi casuali e restituisce la somma di questi numeri.
 */
public class Esercizio2 {

    public static void main(String[] args) {

            Supplier<Integer> supplier = () -> {
                Random random = new Random();
                int n = random.nextInt(1,10);
                int somma = 0;
                for (int i = 0; i < n; i++) somma += random.nextInt(100);
                return somma;
            };

            System.out.println(supplier.get());
        }
}
