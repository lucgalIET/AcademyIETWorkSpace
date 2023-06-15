package esercizi.src.eserciziCasa.Es12_6_23;

public class EsercizioPermutazioniEs3 {
    public static void main(String[] args) {
        String s = "123";
        costruisciPermuta(s, "");
    }

    static void costruisciPermuta(String string, String ans) {

        // caso base
        if (string.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < string.length(); i++) {

            char carattere = string.charAt(i);
            String parziale = string.substring(0, i) + string.substring(i + 1);
            costruisciPermuta(parziale, ans + carattere);
        }
    }



}