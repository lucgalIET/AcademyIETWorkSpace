package marcoMacri.src.eserciziCasa.Es10_6_23;
//Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale
public class EsercizioRicorsivoSommaDiagonalePrincipaleMatriceEs3{
    public static void main(String[] args) {


    int[][]matrix={{9,4,2}
                  ,{5,6,7},
                   {4,5,6}};
        System.out.println("La somma della diagonale della matrice è "+ ricorsivoSomma(0,matrix,matrix.length-1));

}
    public static int ricorsivoSomma(int somma, int[][] matrix,int lenght){


        somma+=matrix[lenght][lenght];
        if (lenght==0){
            return somma;
        }

        return ricorsivoSomma(somma,matrix,lenght-1);}}
