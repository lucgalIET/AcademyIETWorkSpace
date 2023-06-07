package eserciziPerCasa.EserciziFunctionalInterface;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
/*
Combina le interfacce funzionali Consumer, Supplier, Function e Runnable per implementare un programma che
genera una sequenza di numeri casuali , li filtra prendendo solo quelli pari , li eleva al quadrato
e li stampa.*/

public class Esercizio5 {
    static List<Integer> list = new LinkedList<>();
    public static void main(String[] args) {

//        Runnable runnable = () -> {
//            for (Integer x : list) System.out.println(x);
//        };
//
//        Consumer<Integer> consumer = (integer) -> Math.pow(integer, 2);
//
//        Function<List<Integer>, List<Integer>> function = (intList) -> {
//            Iterator<Integer> iterator = intList.iterator();
//            while(iterator.hasNext()){
//                if(iterator.next()%2 == 1) iterator.remove();
//            }
//            //intList.removeIf(x -> x%2==1);
//            return intList;
//        };
//
//        Supplier<List<Integer>> supplier = () -> {
//            List<Integer> generatedList = new ArrayList<>();
//            Random random = new Random();
//            for (int i = 0; i < 10; i++) {
//                generatedList.add(random.nextInt(100));
//            }
//            return generatedList;
//        };
//
       Supplier<Integer> supplier1 = ()->new Random().nextInt(1,100);
        for(int i = 0; i < 5; i++){
            list.add(supplier1.get());
        }

//        list = function.apply(supplier.get());
//        list.forEach(consumer);
//        runnable.run();

        System.out.println("---------------------------");
        System.out.println(list);
        //versione con stream
       // List<Integer> list = supplier.get();
        list.stream().filter(x->x%2==0).map(x->x*x).forEach(System.out::println);
    }
}

