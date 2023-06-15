package ricorsione;

/*
Calcolo della potenza di un numero
Scrivi una funzione ricorsiva in Java che calcoli la potenza di un numero intero positivo base elevato a una potenza intera positiva esponente.
 */
public class Esercizio4 {
    public static void main(String[] args) {
        int numero = 4;
        int potenza = 4;
        System.out.println(potenzaRicorsiva(numero, potenza));
    }

    public static int potenzaRicorsiva(int numero, int potenza) {

        if (potenza == 1)
            return numero;

        return numero * potenzaRicorsiva(numero, potenza - 1);
    }
}
