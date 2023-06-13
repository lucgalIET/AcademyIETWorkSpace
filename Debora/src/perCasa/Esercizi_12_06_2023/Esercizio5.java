package perCasa.Esercizi_12_06_2023;

//Calcolo del numero di permutazioni
//Scrivi una funzione ricorsiva in Java che calcoli il numero di permutazioni di un insieme di n elementi.
//Una permutazione è un riarrangiamento degli elementi senza ripetizioni.
//Ad esempio, le permutazioni dell'insieme {1, 2, 3} sono: {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}.
public class Esercizio5 {

    public static void main(String[] args) {
        int[] numeri = {1, 2, 3};
        System.out.println("Permutazioni iterative");
        permutazioniIterativo(numeri);
        System.out.println("-----------------------------------------\n");
        System.out.println("Permutazioni ricorsive");
        permutazioniRicorsivo(numeri, numeri.length - 1, fattoriale(numeri.length));

    }

    public static void permutazioniIterativo(int[] a) {
        int n = fattoriale(a.length - 1);
        for (int i = 0; i < n; i++) {
            int temp = 0, temp1 = 0;
            for (int j = 0; j < a.length; j++) {
                if (j == 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    stampaArray(a);
                } else if (j == a.length - 1) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    stampaArray(a);
                } else {
                    temp = a[j + 1];
                    a[j + 1] = a[j - 1];
                    a[j - 1] = temp;
                    stampaArray(a);
                }
            }
        }
    }

    public static void permutazioniRicorsivo(int[] a, int index, int count) {
        int temp = 0;
        if (count == 1) {
            stampaArray(scambia(a, index, index + 1));
        } else {
            if (index == 0) {
                stampaArray(scambia(a, index, index + 1));
                permutazioniRicorsivo(a, a.length - 1, count - 1);
            } else if (index == a.length - 1) {
                stampaArray(scambia(a, index, index - 1));
                permutazioniRicorsivo(a, index - 1, count - 1);
            } else {
                stampaArray(scambia(a, index + 1, index - 1));
                permutazioniRicorsivo(a, index - 1, count - 1);
            }
        }

    }

    public static int[] scambia(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
        return a;
    }

    public static int fattoriale(int n) {
        if (n == 1) return 1;
        return n * fattoriale(n - 1);
    }

    public static void stampaArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

}
