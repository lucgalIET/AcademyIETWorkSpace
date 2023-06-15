package complessita;

//Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)
public class Esercizio1 {
    public static void main(String[] args) {
        int[] numeri = {9, 2, 3, 10, 5, 20, 7, 8};
        int numMax = numeri[0];
        System.out.println(valoreMinimoRicorsivo(numeri, numMax));

    }

    public static int valoreMinimoRicorsivo(int[] numeri, int numMax) {
        return valoreMinimoImpl(numeri, 0, numMax);
    }

    public static int valoreMinimoImpl(int[] numeri, int i, int numMax) {
        if (i == numeri.length)
            return numMax;

        if (numeri[i] > numMax) {
            numMax = numeri[i];
        }
        return valoreMinimoImpl(numeri, i + 1, numMax);
    }
}
