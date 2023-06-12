package eserciziacasa.eserciziricorsione;

/*
Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)
Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)
Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale
Scrivere un metodo boolean che verifica se un intero è contenuto in un array
Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array

[BONUS] scrivere i rispettivi metodi iterativi
*/
public class Esercizio5 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sommaPariR(arr, arr.length - 1));
        System.out.println(sommaPariI(arr));
    }

    //VERSIONE RICORSIVA
    static public int sommaPariR(int[] arr, int index) {
        if (index == -1) return 0;
//        if (arr[index] % 2 == 0) return arr[index] + sommaPariR(arr, index - 1);
//        return sommaPariR(arr, index - 1);
        return (arr[index] % 2 == 0) ? arr[index] + sommaPariR(arr, index - 1) : sommaPariR(arr, index - 1);
    }

    //VERSIONE ITERATIVA
    static public int sommaPariI(int[] arr) {
        int somma = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) somma += arr[i];
        }
        return somma;
    }
}
