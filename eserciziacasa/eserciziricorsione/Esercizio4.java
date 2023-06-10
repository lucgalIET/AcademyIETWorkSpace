package eserciziacasa.eserciziricorsione;

/*
Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)
Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)
Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale
Scrivere un metodo boolean che verifica se un intero è contenuto in un array
Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array

[BONUS] scrivere i rispettivi metodi iterativi
*/
public class Esercizio4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(containsR(arr, arr.length - 1, 5));
        System.out.println(containsI(arr, 2));
    }

    //VERSIONE RICORSIVA
    static public boolean containsR(int[] arr, int index, int toFind) {
        if (index == -1) return false;
        if (arr[index] == toFind) return true;
        return containsR(arr, index - 1, toFind);
    }

    //VERSIONE ITERATIVA
    static public boolean containsI(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) return true;
        }
        return false;
    }
}
