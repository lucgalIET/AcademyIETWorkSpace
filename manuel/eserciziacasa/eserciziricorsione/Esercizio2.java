package manuel.eserciziacasa.eserciziricorsione;

/*
Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)
Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)
Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale
Scrivere un metodo boolean che verifica se un intero è contenuto in un array
Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array

[BONUS] scrivere i rispettivi metodi iterativi
*/
public class Esercizio2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sommaR(arr, arr.length - 1));
        System.out.println(sommaI(arr));
    }

    //VERSIONE RICORSIVA
    public static int sommaR(int[] arr, int index) {
        if (index == 0) return arr[0];
        return arr[index] + sommaR(arr, index - 1);
    }

    //VERSIONE ITERATIVA
    public static int sommaI(int[] arr) {
        int somma = 0;
        for (int i = 0; i < arr.length; i++) {
            somma += arr[i];
        }
        return somma;
    }

}