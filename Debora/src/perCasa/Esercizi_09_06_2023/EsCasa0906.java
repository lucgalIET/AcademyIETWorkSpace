package perCasa.Esercizi_09_06_2023;

/*
Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)
Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)
Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale
Scrivere un metodo boolean che verifica se un intero è contenuto in un array
Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array

[BONUS] scrivere i rispettivi metodi iterativi
*/


public class EsCasa0906 {

    public static void main(String[] args) {
        int[] array = {3, 8, 33, 1, 4, 9, 12};
        int[][] mat = new int[][]{{5, 4, 6}, {7, 9, 3}, {1, 5, 4}};
        System.out.println("Il minimo iterativo dell'array è: " + minimoIterativo(array));
        System.out.println("Il minimo ricorsivo dell'array è: " + minimoRicorsivo(array, array.length - 1));
        System.out.println("Il massimo iterativo dell'array è: " + maxIterativo(array));
        System.out.println("Il massimo ricorsivo dell'array è: " + maxRicorsivo(array, array.length - 1));
        System.out.println("La somma iterativa dell'array è: " + sommaIterativa(array));
        System.out.println("La somma ricorsiva dell'array è: " + sommaRicorsiva(array, array.length - 1));
        System.out.println("La somma iterativa della diagonale dell'array è: " + sommaDiagonaleIterativa(mat));
        System.out.println("La somma ricorsiva della diagonale dell'array è: " + sommaDiagonaleRicorsiva(mat, mat.length - 1));
        System.out.println(cercaElementoIterativo(array, 3) ? "L'elemento è presente" : "L'elemento non è presente");
        System.out.println(cercaElementoRicorsivo(array, 3, array.length - 1) ? "L'elemento è presente" : "L'elemento non è presente");
        System.out.println("La somma pari iterativa dell'array è: " + sommaPariIterativa(array));
        System.out.println("La somma pari ricorsiva dell'array è: " + sommaPariRicorsiva(array, array.length - 1));
        System.out.println("La somma dispari iterativa dell'array è: " + sommaDispariIterativa(array));
        System.out.println("La somma dispari ricorsiva dell'array è: " + sommaDispariRicorsiva(array, array.length - 1));

    }

    public static int minimoIterativo(int[] array) {
        int min = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static int minimoRicorsivo(int[] array, int count) {
        if (count == 0) return array[count];
        int numero = minimoRicorsivo(array, count - 1);
        return Math.min(array[count], numero);
    }

    public static int maxIterativo(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int maxRicorsivo(int[] array, int count) {
        if (count == 0) return array[count];
        int numero = maxRicorsivo(array, count - 1);
        return Math.max(array[count], numero);
    }

    public static int sommaIterativa(int[] array) {
        int somma = 0;
        for (int i : array) {
            somma += i;
        }
        return somma;
    }

    public static int sommaRicorsiva(int[] array, int count) {
        if (count == 0) return array[count];
        return array[count] + sommaRicorsiva(array, count - 1);
    }

    public static int sommaDiagonaleIterativa(int[][] mat) {
        int somma = 0;
        for (int i = 0; i < mat.length; i++) {
            somma += mat[i][i];
        }
        return somma;
    }

    public static int sommaDiagonaleRicorsiva(int[][] mat, int index) {
        if (index == 0) return mat[0][0];
        return mat[index][index] + sommaDiagonaleRicorsiva(mat, index - 1);
    }

    public static boolean cercaElementoIterativo(int[] array, int elem) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) return true;
        }
        return false;
    }

    public static boolean cercaElementoRicorsivo(int[] array, int elem, int index) {
        if (array[index] == elem) return true;
        else if (index == 0) return false;
        return cercaElementoRicorsivo(array, elem, index - 1);
    }

    public static int sommaPariIterativa(int[] array) {
        int somma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) somma += array[i];
        }
        return somma;
    }

    public static int sommaPariRicorsiva(int[] array, int index) {
        if (index == -1) return 0;
        else if (array[index] % 2 == 0) return array[index] + sommaPariRicorsiva(array, index - 1);
        return sommaPariRicorsiva(array, index - 1);
    }

    public static int sommaDispariIterativa(int[] array) {
        int somma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) somma += array[i];
        }
        return somma;
    }

    public static int sommaDispariRicorsiva(int[] array, int index) {
        if (index == -1) return 0;
        else if (array[index] % 2 != 0) return array[index] + sommaDispariRicorsiva(array, index - 1);
        return sommaDispariRicorsiva(array, index - 1);
    }
}
