package manuel.eserciziacasa.eserciziricorsione;
/*
Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)
Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)
Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale
Scrivere un metodo boolean che verifica se un intero è contenuto in un array
Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array

[BONUS] scrivere i rispettivi metodi iterativi
*/

public class Esercizio1 {

    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 234, 245, 2, 67, 5, 969};
        System.out.println(maxR(arr, arr.length - 1));
        System.out.println(maxI(arr));
    }

    //VERSIONE RICORSIVA
    static public int maxR(int[] arr, int index) {
        if (index == 0) return arr[0];

        return max(arr[index], maxR(arr, index - 1));
    }

    static public int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    //VERSIONE ITERATIVA
    static public int maxI(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
