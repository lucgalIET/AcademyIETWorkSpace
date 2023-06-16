package perCasa.Esercizi_15_06_2023;

import java.util.Random;

//Scrivi un programma in Java che simuli la condivisione di un conto corrente tra due thread che effettuano prelievi e depositi.
//Utilizza sia un oggetto di blocco che il modificatore synchronized per sincronizzare il blocco di codice critico.
//(e' possibile utilizzare 'synchronized' anche nella firma dei metodi)
public class Esercizio2 {

    private static final Object lock = new Object();
    private static int contoCorrente = 0;
    //private static double cifra = 0;

    static class Prelievo implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    Random rand = new Random();
                    int cifra = rand.nextInt(1,100);
                    contoCorrente -= cifra;
                    System.out.println("Prelievo "+ cifra+ " euro eseguito. Saldo totale: " + contoCorrente + " da " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }

    static class Deposito implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        Random rand = new Random();
                        int cifra = rand.nextInt(1,100);
                        contoCorrente += cifra;
                        System.out.println("Deposito di "+ cifra+ " euro eseguito. Saldo totale: " + contoCorrente + " da " + Thread.currentThread().getName());
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }


    }

    public static void main(String[] args) {
        Thread depositoThread = new Thread(new Deposito());
        Thread prelievoThread = new Thread(new Prelievo());

        depositoThread.start();
        prelievoThread.start();
    }
}
