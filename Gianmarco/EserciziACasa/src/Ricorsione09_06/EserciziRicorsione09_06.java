package Ricorsione09_06;
/*
Scrivere un metodo ricorsivo che, dato un array di interi,
restituisca il valore minimo (oppure il valore massimo)

Scrivere un metodo ricorsivo che, dato un array di interi,
restituisce la somma degli elementi (oppure altre operazioni)

Scrivere un metodo ricorsivo che, data una matrice a di interi,
restituisce la somma della sua diagonale principale

Scrivere un metodo boolean che verifica se un intero è contenuto in un array

Scrivere un programma che restituisca la somma corrispondente alla totalità
di numeri dispari (oppure pari)  presenti all’interno di un array

[BONUS] scrivere i rispettivi metodi iterativi
*/

public class EserciziRicorsione09_06 {
    public static void main(String[] args) {
        int[] array = {13, 444, 55, 76, 28, 99,125,2,3,65,843,45566};

        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(massimoRicorsivo(array, array.length - 1));
        System.out.println(sommaRicorsiva(array, array.length - 1));
        System.out.println(diagonaleRicorsiva(matrice, matrice.length - 1, matrice.length - 1));
        System.out.println(interoPresente(array,array.length-1,99));
    }

    public static int massimoRicorsivo(int[] array, int indice) {
        if (indice == 0) return array[indice];
        int num = massimoRicorsivo(array, indice - 1);
        return Math.max(array[indice], num);
    }

    public static int sommaRicorsiva(int[] array, int indice) {
        if (indice == 0) return array[indice];
        return array[indice] + sommaRicorsiva(array, indice - 1);
    }

    public static int diagonaleRicorsiva(int[][] matrice, int i, int j) {
        if (i == 0 && j == 0) return matrice[i][j];
        return matrice[i][j] + diagonaleRicorsiva(matrice, i - 1, j - 1);
    }

    public static boolean interoPresente (int[] array, int indice,int numeroDaCercare){
        if (array[indice] == numeroDaCercare) return true;
        if (indice==0)return false;
        return interoPresente(array, indice - 1,99);
    }

}