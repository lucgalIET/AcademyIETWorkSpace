package Ricorsione;

public class es2_12_06 {
    public static void main(String[] args) {




    }


   // public static int massimoComunDivisore(int primoNumero, int secondoNumero) {

   // }


    public static int massimoComunDivisoreRicorsivo(int primoNumero, int secondoNumero) {
        if (primoNumero == 0) return secondoNumero;
        if (secondoNumero == 0) return primoNumero;

            int temp = primoNumero % secondoNumero;
            primoNumero = secondoNumero;
            secondoNumero = temp;
        return primoNumero;
    }
}
