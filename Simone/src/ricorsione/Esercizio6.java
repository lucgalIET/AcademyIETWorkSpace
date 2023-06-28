package ricorsione;

import java.util.Arrays;

/*
Calcolo del numero di permutazioni
Scrivi una funzione ricorsiva in Java che calcoli il numero di permutazioni di un insieme di n elementi.
Una permutazione è un riarrangiamento degli elementi senza ripetizioni.
Ad esempio, le permutazioni dell'insieme {1, 2, 3} sono: {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}.
 */
public class Esercizio6 {
    public static void main(String[] args) {
        int[] elementi = {1, 2, 3};
        permutazione(elementi);
    }

    public static void permutazione(int[] elementi) {
        permutazioneRicorsiva(elementi, 0);
    }

    private static void permutazioneRicorsiva(int[] elementi, int i) {
        if (i == elementi.length - 1)
            System.out.println(Arrays.toString(elementi));
        int temp;
        for (int j = i; j < elementi.length; j++) {
            temp = elementi[i];
            elementi[i] = elementi[j];
            elementi[j] = temp;

            permutazioneRicorsiva(elementi, i + 1);

            temp = elementi[i];
            elementi[i] = elementi[j];
            elementi[j] = temp;
        }
    }
}



