package esercizi.src.eserciziCasa.Es12_6_23;

public class EsercizioCalcoloPotenzaNumeroEs2 {
    public static void main(String[] args) {

            int base = 5, x = 3;
            System.out.println ("Required Power is " + potenza(base, x));
        }

        static int potenza(int base, int x)
        {
            if (x == 0)     //caso base
                return 1;
            return (base * potenza(base, x - 1));
        }
    }