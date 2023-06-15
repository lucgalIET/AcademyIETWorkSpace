package perCasa.Esercizi_12_06_2023;

//Calcolo della potenza di un numero
//Scrivi una funzione ricorsiva in Java che calcoli la potenza di un numero intero positivo base elevato a una potenza intera positiva esponente.

public class Esercizio4 {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(potenzaIterativa(2, 4));
        System.out.println(potenzaRicorsiva(2, 4));

    }


    public static int potenzaIterativa(int base, int esponente) {
        int pot = 1;
        for (int i = 0; i < esponente; i++) {
            pot *= base;
        }
        return pot;
    }

    public static int potenzaRicorsiva(int base, int esponente) {
        if (esponente == 0) return 1;
        return base * potenzaRicorsiva(base, esponente - 1);
    }
}
