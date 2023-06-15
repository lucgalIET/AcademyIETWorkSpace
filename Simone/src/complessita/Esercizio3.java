package complessita;

//Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale
public class Esercizio3 {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sommaDiagonaleRicorsivo(matrice, 0));
    }

    public static int sommaDiagonaleRicorsivo(int[][] matrice, int i) {
        if (i == matrice.length)
            return 0;

        return matrice[i][i] + sommaDiagonaleRicorsivo(matrice, i + 1);
    }
}
