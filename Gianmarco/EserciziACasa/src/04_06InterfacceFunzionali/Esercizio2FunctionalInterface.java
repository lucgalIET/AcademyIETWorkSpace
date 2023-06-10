package EserciziCasa_04_06_23;

import java.util.Random;
import java.util.function.Supplier;

/*2.Implementa un Supplier che genera
una sequenza di numeri interi casuali
e restituisce la somma di questi numeri.
*/
public class Esercizio2FunctionalInterface {
    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Integer> supplier = () -> {
            int somma = 0;
            for (int i = 0; i < 10; i++) {

                somma += random.nextInt(1234);
            }
            return somma;
        };

        System.out.println(supplier.get());

    }

}

