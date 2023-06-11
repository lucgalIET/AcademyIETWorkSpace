package EsercizioPianeti.complessita;

//Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array
public class Esercizio5 {
    public static void main(String[] args) {
        int[] numeri = {9, 2, 3, 10, 5, 17, 7, 8};

        System.out.println(sommaRicorsivo(numeri));
    }

    public static int sommaRicorsivo(int[] numeri) {
        int somma = 0;
        return sommaRicorsivoImpl(numeri, 0, somma);
    }

    public static int sommaRicorsivoImpl(int[] numeri, int i, int somma) {
        if (i == numeri.length)
            return somma;
        if (numeri[i] % 2 != 0)
            somma = somma + numeri[i];
        return sommaRicorsivoImpl(numeri, i + 1, somma);
    }
}

