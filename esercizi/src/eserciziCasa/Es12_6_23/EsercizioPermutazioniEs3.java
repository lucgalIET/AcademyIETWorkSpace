package esercizi.src.eserciziCasa.Es12_6_23;

public class EsercizioPermutazioniEs3 {
    public static void main(String[] args) {
        String s = "123";
        stampaPermutazioni(s, "");
    }

    static void stampaPermutazioni(String str, String ans) {

        // caso base
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // 1 carattere
            char carattere = str.charAt(i);

            // Resto della stringa dopo l'esclusione
            // i-esimo carattere
            String ros = str.substring(0, i) + str.substring(i + 1);

            // chiamata ricorsiva
            stampaPermutazioni(ros, ans + carattere);
        }
    }

    // Driver code

}