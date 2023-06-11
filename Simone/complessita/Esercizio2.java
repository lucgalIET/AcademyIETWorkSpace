package EsercizioPianeti.complessita;

//Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)
public class Esercizio2 {
    public static void main(String[] args) {
        int[] numeri = {9, 2, 3, 10, 5, 20, 7, 8};
        System.out.println(sommaRicorsivo(numeri, 0));
    }

    public static int sommaRicorsivo(int[] numeri, int i) {
        if (i == numeri.length)
            return 0;

        return numeri[i] + sommaRicorsivo(numeri, i + 1);
    }
}
