package eserciziPerCasa.esercizi_ricorsione;
/*
3) Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale

 */
public class Esercizio3 {
    public static void main(String[] args) {

        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("La somma degli elementi della diagonale principale in modo ricorsivo è " + sommaDiagonalePrincipaleRicorsivo(matrice, matrice.length-1));
        System.out.println("La somma degli elementi della diagonale principale in modo iterative è " + sommaDiagonalePrincipaleIterativo(matrice, matrice.length -1));



    }

    private static int sommaDiagonalePrincipaleIterativo(int[][] matrice, int indice) {

        int somma  = 0;
        for (int i = 0; i < matrice.length; i++){
           // for (int j = 0; j < matrice.length; j++){
              //  if(i == j)
                    somma += matrice[i][i];
            //}
        }

        return somma;
    }

    private static int sommaDiagonalePrincipaleRicorsivo(int[][] matrice, int indice) {

        if(indice == 0) return matrice[0][0];

        return matrice[indice][indice] + sommaDiagonalePrincipaleRicorsivo(matrice, indice -1);
    }


}
