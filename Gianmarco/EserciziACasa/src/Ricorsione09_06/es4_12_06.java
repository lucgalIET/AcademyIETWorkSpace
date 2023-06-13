package Ricorsione09_06;
//Esercizio 4: Calcolo della potenza di un numero
//Scrivi una funzione ricorsiva in Java che calcoli
// la potenza di un numero intero positivo base elevato
// a una potenza intera positiva esponente.

public class es4_12_06 {
    public static void main(String[] args) {
        System.out.println(calcoloPotenzaRicorsivo(3, 3));
        System.out.println(calcoloPotenzaIterativo(11, 4));

    }

    public static int calcoloPotenzaRicorsivo(int numero, int potenza) {
        if (potenza == 0) return 1;

        return numero * calcoloPotenzaRicorsivo(numero, potenza - 1);
    }

    public static int calcoloPotenzaIterativo(int numero, int potenza) {
        int appoggio = numero;
        for (int i = 1; i < potenza; i++) {
            appoggio *= numero;
        }
        return appoggio;
    }


}
