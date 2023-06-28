package Ricorsione09_06;

/*
Esercizio 3: Stampa di tutti i sottomassi di una stringa
Scrivi una funzione ricorsiva in Java che prenda in input
una stringa e stampi tutti i sottomassi possibili.
Un sottomasso di una stringa è ottenuto selezionando
un insieme di caratteri consecutivi dalla stringa originale, in qualsiasi ordine.
Ad esempio, per la stringa "abc", i sottomassi sono:
 "", "a", "b", "c", "ab", "ac", "bc", "abc".
 */
public class es3_12_06 {
    public static void main(String[] args) {
        String stringa = "abcdef";
        sottoMassi(stringa);

    }

    public static void sottoMassi(String stringa) {
        System.out.println(" ");
        for (int i = 0; i < stringa.length(); i++) {
            for (int j = i + 1; j <= stringa.length(); j++) {
                System.out.println(stringa.substring(i, j));
            }
        }
        System.out.println(stringa.substring(0, 1) +
                stringa.substring(stringa.length() - 1, stringa.length()));

    }

    public static void sottoMassiRicorsiva(String stringa, int beginIndex, int endIndex) {

    }


}
