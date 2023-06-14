package eserciziPerCasa.esercizi_ricorsione;
/*
Calcolo della potenza di un numero
Scrivi una funzione ricorsiva in Java che calcoli la potenza di un numero intero positivo base
elevato a una potenza intera positiva esponente.

 */
public class Esercizio10 {
    public static void main(String[] args) {

        int numero = 3;
        int potenza = 4;

        System.out.println("Ricorsivo " + numero + "^" + potenza + " = " + calcolaPotenzaRicorsivo(numero, potenza));
        System.out.println("Iterativo " + numero + "^" + potenza + " = " + calcolaPotenzaIterativo(numero, potenza));


    }
    // versione ricorsiva
    private static int calcolaPotenzaRicorsivo(int numero, int potenza) {
        if(potenza == 0) return 1;
        return numero * calcolaPotenzaRicorsivo(numero, potenza - 1);

    }

    //versioe iterativa
    public  static int calcolaPotenzaIterativo(int numero, int potenza){

        if(potenza == 0) return 1;
        if(numero == 0) return 0;

        int risultato = numero;
        for(int i = 1; i < potenza; i++){
            risultato *= numero;
        }

        return risultato;

    }
}
