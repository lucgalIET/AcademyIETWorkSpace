package eserciziacasa.esercizifunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Esercizio2 {
    static int sum = 0;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            int n = random.nextInt(1,10);
            int somma = 0;
            for (int i = 0; i < n; i++) {
                somma += random.nextInt(100);
                list.add(random.nextInt(100));
            }
            return somma;
        };

        System.out.println(supplier.get());

        list.forEach(x-> sum+=x);
        System.out.println(list);
        System.out.println(sum);
    }
}
