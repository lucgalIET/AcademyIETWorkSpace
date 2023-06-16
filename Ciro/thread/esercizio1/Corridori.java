package Ciro.thread.esercizio1;

import java.util.Random;
import java.util.concurrent.Semaphore;

/*
Scrivi un programma in Java che simuli una corsa di 100 metri tra 2 squadre, A e B.
Ogni squadra è composta da 4 corridori. Ogni corridore deve attraversare una sezione
critica rappresentata da un tratto di 25 metri.

*/
public class Corridori implements Runnable {
    private static Object object = new Object();
    private static Semaphore semaphore = new Semaphore(1);
    private static int squadraA;
    private static int squadraB;
    private String squadra;

    public Corridori(String squadra) {
        this.squadra = squadra;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            boolean random = new Random().nextBoolean();
            if (random) {
                Thread.sleep(1000);
            }else{
                Thread.sleep(3000);
            }

            synchronized (object) {
                if (squadra.equals("A")) {
                    squadraA += 25;
                    System.out.println("La squadra A ha percorso " + squadraA + " metri " + Thread.currentThread().getName());
                    Thread.sleep(2000);
                } else {
                    squadraB += 25;
                    System.out.println("La squadra B ha percorso " + squadraB + " metri " + Thread.currentThread().getName());
                    Thread.sleep(2000);
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }

    }


    public static void main(String[] args) {

        Thread[] thread = new Thread[8];//8 corridori
        for (int i = 0; i < thread.length; i++) {
            if (i <= 3) {
                thread[i] = new Thread(new Corridori("A"));
            } else {
                thread[i] = new Thread(new Corridori("B"));
            }
        }

        for (Thread t : thread) {
            t.start();
        }
    }
}