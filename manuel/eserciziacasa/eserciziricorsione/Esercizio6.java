package manuel.eserciziacasa.eserciziricorsione;

import java.util.Set;
import java.util.TreeSet;

public class Esercizio6 {
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
