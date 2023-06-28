package Ciro.esercizi_ricorsione;

import java.util.Set;
import java.util.TreeSet;
/*
Stampa di tutti i sottomassi di una stringa Scrivi una funzione ricorsiva in Java che prenda in input una stringa e
stampi tutti i sottomassi possibili. Un sottomasso di una stringa è ottenuto selezionando un insieme di caratteri consecutivi
dalla stringa originale, in qualsiasi ordine. Ad esempio, per la stringa "abc",
i sottomassi sono: "", "a", "b", "c", "ab", "ac", "bc", "abc".
 */


public class Esercizio9 {
    static Set<String> stringSet = new TreeSet<>();
    public static void main(String[] args) {
        String stringa = "abcd";
        sottoMassiRicorsiva(stringa);
        System.out.println(stringSet);
    }

    public static void sottoMassi(String s) {

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static void sottoMassiRicorsiva(String s) {
        if(s.isEmpty()) return;
        stringSet.add(s);
        sottoMassiRicorsiva(s.substring(1));
        sottoMassiRicorsiva(s.substring(0,s.length()-1));
    }
}
