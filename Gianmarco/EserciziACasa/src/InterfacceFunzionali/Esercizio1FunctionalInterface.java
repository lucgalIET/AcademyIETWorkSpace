package InterfacceFunzionali;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Esercizio1FunctionalInterface {
    public static void main(String[] args) {
        List<String> listaParole = Arrays.asList("shrek", "ciuchino", "fiona", "gatto con gli stivali", "azzurro", "fata madrina");

        Consumer<List<String>> maiuscolizzante = (stringList) -> stringList.replaceAll(parola -> parola.toUpperCase());
        maiuscolizzante.accept(listaParole);
        System.out.println(listaParole);
    }
}
