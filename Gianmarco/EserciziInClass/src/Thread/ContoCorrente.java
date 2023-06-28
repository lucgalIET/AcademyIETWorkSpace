package Thread;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

/*
Scrivi un programma in Java che simuli la condivisione
di un conto corrente tra due thread che effettuano prelievi e depositi.
Utilizza sia un oggetto di blocco che il modificatore synchronized
per sincronizzare il blocco di codice critico.
(e' possibile utilizzare 'synchronized' anche nella firma dei metodi)
 */
public class ContoCorrente {
    Scanner scanner = new Scanner(System.in);
    private Semaphore semaphore;
    private int soldi = 500;

    public ContoCorrente() {
        this.semaphore = new Semaphore(1);
    }


    public synchronized void deposito() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() +
                    ": Quanti soldi vorresti depositare?");
            soldi += scanner.nextInt();
            System.out.println("Calcolo del saldo dopo il deposito...");
            Thread.sleep(1500);
            System.out.println("Il saldo attuale corrisponde a: " + soldi);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();

        }
    }

    public synchronized void prelievo() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() +
                    ": Quanti soldi vorresti prelevare?");
            soldi -= scanner.nextInt();
            if (soldi < 0) {
                throw new RuntimeException("Errore, il prelievo non può superare" +
                        "il saldo massimo. Ripetere l'operazione!");
            }
            Thread.sleep(1500);
            System.out.println("Il saldo attuale corrisponde a: " + soldi);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        ContoCorrente contoCorrente = new ContoCorrente();

        Thread threadDeposito = new Thread(() -> {
            contoCorrente.deposito();
        });

        Thread threadPrelievo = new Thread(() -> {
            contoCorrente.prelievo();
        });

        threadDeposito.start();
        threadPrelievo.start();
    }
}
