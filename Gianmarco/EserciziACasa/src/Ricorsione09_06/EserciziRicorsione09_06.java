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

import java.nio.file.DirectoryStream;

public class EserciziRicorsione09_06 {
    public static void main(String[] args) {
        int[] array = {13, 444, 55, 76, 28, 99, 125, 2, 3, 65, 843, 45566};

        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Massimo ricorsivo: " + massimoRicorsivo(array, array.length - 1));
        System.out.println("Massimo iterativo: " + massimoIterativo(array));
        System.out.println("Somma ricorsiva: " + sommaRicorsiva(array, array.length - 1));
        System.out.println("Somma iterativa: " + sommaIterativa(array));
        System.out.println("Somma diagonale Ricorsiva: " + diagonaleRicorsiva(matrice, matrice.length - 1, matrice.length - 1));
        System.out.println("Somma diagonale iterativa: " + diagonaleIterativa(matrice));
        System.out.println("99 presente ricorsivo: " + interoPresenteRicorsivo(array, array.length - 1, 99));
        System.out.println("99 presente iterativo: "+ interoPresenteIterativo(array));
        System.out.println("Somma Pari: " + sommaPari(array, array.length - 1));
    }

    public static int massimoRicorsivo(int[] array, int indice) {
        if (indice == 0) return array[indice];
        int num = massimoRicorsivo(array, indice - 1);
        return Math.max(array[indice], num);
    }

    public static int massimoIterativo(int[] array) {
        int max = 0;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int sommaRicorsiva(int[] array, int indice) {
        if (indice == 0) return array[indice];
        return array[indice] + sommaRicorsiva(array, indice - 1);
    }

    public static int sommaIterativa(int[] array) {
        int somma = 0;
        for (int num : array) {
            somma += num;
        }
        return somma;
    }

    public static int diagonaleRicorsiva(int[][] matrice, int i, int j) {
        if (i == 0 && j == 0) return matrice[i][j];
        return matrice[i][j] + diagonaleRicorsiva(matrice, i - 1, j - 1);
    }

    public static int diagonaleIterativa(int[][] matrice) {
        int sommaDiagonale = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                    sommaDiagonale += matrice[i][j];
                }
            }
        }
        return sommaDiagonale;
    }


    public static boolean interoPresenteRicorsivo(int[] array, int indice, int numeroDaCercare) {
        if (array[indice] == numeroDaCercare) return true;
        if (indice == 0) return false;
        return interoPresenteRicorsivo(array, indice - 1, 99);
    }

    public static boolean interoPresenteIterativo(int[] array) {
        boolean isPresent=false;
        for (int num : array) {
            if (num == 99) {
                isPresent=true;
            }
        }return isPresent;
    }

    public static int sommaPari(int[] array, int indice) {
        if (indice == 0) return array[indice];

        if (array[indice] % 2 == 0) return array[indice] + sommaPari(array, indice - 1);
        return sommaPari(array, indice - 1);

    }
}