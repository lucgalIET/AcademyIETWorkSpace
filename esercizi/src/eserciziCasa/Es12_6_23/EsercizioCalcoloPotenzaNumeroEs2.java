package esercizi.src.eserciziCasa.Es12_6_23;

public class EsercizioCalcoloPotenzaNumeroEs2 {
    public static void main(String[] args) {

            int base = 5, esponente = 3;
            System.out.println ("La potenza calcolata è " + potenza(base, esponente));
        }

        static int potenza(int base, int esponente)
        {
            if (esponente == 0)     //caso base
                return 1;
            return (base * potenza(base, esponente - 1));
        }
    }