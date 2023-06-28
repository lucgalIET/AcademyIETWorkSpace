package manuel.eserciziacasa.eserciziricorsione;

/*
Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)
Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)
Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale
Scrivere un metodo boolean che verifica se un intero è contenuto in un array
Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array

[BONUS] scrivere i rispettivi metodi iterativi
*/
public class Esercizio3 {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 1, 6}, {7, 8, 1}};
        System.out.println(diagonaleR(mat, mat.length - 1));
        System.out.println(diagonaleI(mat));
    }

    //VERSIONE RICORSIVA
    static public int diagonaleR(int[][] mat, int index) {
        if (index == 0) return mat[0][0];
        return mat[index][index] + diagonaleR(mat, index - 1);
    }

    //VERSIONE ITERATIVA
    static public int diagonaleI(int[][] mat) {
        int somma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) somma += mat[i][j];
            }
        }
        return somma;
    }
}
