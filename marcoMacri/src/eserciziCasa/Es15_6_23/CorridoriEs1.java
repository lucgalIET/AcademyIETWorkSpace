package marcoMacri.src.eserciziCasa.Es15_6_23;

import java.util.Random;
import java.util.concurrent.Semaphore;

//Esercizio 1:
//        Scrivi un programma in Java che simuli una corsa di 100 metri tra 2 squadre, A e B.
//        Ogni squadra è composta da 4 corridori. Ogni corridore deve attraversare una sezione critica rappresentata da un tratto di 25 metri.
public class CorridoriEs1 implements Runnable {
    private static int squadraA;
    private static int squadraB;
    private String squadra;
    private static Object object = new Object();

    private static Semaphore semaphore = new Semaphore(1);

    public CorridoriEs1() {
    }

    public CorridoriEs1(String squadra) {
        this.squadra = squadra;
    }

    @Override
    public void run() {

        try {

            semaphore.acquire();
            boolean random = new Random().nextBoolean();
            if (random) {
                Thread.sleep(1000);
            } else {
                Thread.sleep(3000);
            }
            synchronized (object) {
                if (squadra.equals("A")) {
                    squadraA += 25;
                    System.out.println("La squadra A ha percorso " + squadraA + " metri " + Thread.currentThread().getName());

                    Thread.sleep(2000);
                } else {
                    squadraB += 25;
                    System.out.println("La suadra B ha  percorso " + squadraB + " metri " + Thread.currentThread().getName());

                    Thread.sleep(2000);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }

    }

    public static void main(String[] args) {


        Thread[] thread = new Thread[8];
        for (int i = 0; i < thread.length; i++) {
            if (i <= 3) {
                thread[i] = new Thread(new CorridoriEs1("A"));
            } else {
                thread[i] = new Thread(new CorridoriEs1("B"));
            }
        }
        for (Thread t : thread) {
            t.start();
        }

    }


}
