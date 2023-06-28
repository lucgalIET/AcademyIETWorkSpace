package Ciro.esercizi_ricorsione;
import java.lang.*; // predefinita
import java.util.Arrays;

/*
Calcolo del numero di permutazioni
Scrivi una funzione ricorsiva in Java che calcoli il numero di permutazioni di un insieme di n elementi.
Una permutazione è un riarrangiamento degli elementi senza ripetizioni.
Ad esempio, le permutazioni dell'insieme {1, 2, 3} sono: {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}.
 */
public class Esercizio11{

    public static void main(String[] args)    {
        int[] array = {1, 2, 3};
        permutazioni(array,0);
    }

    // Funzione ricorsiva per calcolare le permutazioni
    private static void permutazioni(int[] array, int indiceCorrente){
        if (indiceCorrente == array.length - 1)
            System.out.println(Arrays.toString(array));

        for (int i = indiceCorrente; i < array.length; i++){
            swap(array, indiceCorrente, i);
            permutazioni(array, indiceCorrente + 1);
            swap(array, indiceCorrente, i);
        }
    }

    // Funzione per scambiare due caratteri nell' array
    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
