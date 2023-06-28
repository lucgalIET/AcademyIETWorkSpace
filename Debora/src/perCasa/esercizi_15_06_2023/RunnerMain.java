package perCasa.esercizi_15_06_2023;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Scrivi un programma in Java che simuli una corsa di 100 metri tra 2 squadre, A e B.
Ogni squadra è composta da 4 corridori. Ogni corridore deve attraversare una sezione
critica rappresentata da un tratto di 25 metri.
 */
public class RunnerMain implements Runnable {
    private static Semaphore semaphore = new Semaphore(1);
    private static Lock lock = new ReentrantLock();
    private int metriPercorsiA;
    private int metriPercorsiB;
    private String team;

    private static int count = 0;
    private static boolean vincitore = false;

    public RunnerMain() {
        this.metriPercorsiA = 0;
        this.metriPercorsiB = 0;
    }

    @Override
    public void run() {
        try {

            //lock.lock();
            semaphore.acquire();
            Random rand = new Random();
            boolean n = rand.nextBoolean();
            if(n){
                Thread.sleep(1000);
            }else{
                Thread.sleep(4000);
            }

            if (count % 2 == 0) {
                System.out.println("Il corridore della squadra A è partito! " + Thread.currentThread().getName());
            } else {
                System.out.println("Il corridore della squadra B è partito! " + Thread.currentThread().getName());
            }
            count++;
            //Thread.sleep(2000);

            metriPercorsiA += 25;
            metriPercorsiB += 25;
            //System.out.println((metriPercorsiA));

            if(metriPercorsiA == 100){
                System.out.println("Ha vinto la squadra A");
                vincitore = true;
            }else if(metriPercorsiB == 100){
                System.out.println("Ha vinto la squadra B");
                vincitore = true;
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            semaphore.release();
            //lock.unlock();
        }

    }


    public static void main(String[] args) {
        RunnerMain squadraA = new RunnerMain();
        RunnerMain squadraB = new RunnerMain();
        Thread[] thread = new Thread[8];

        for (int i = 0; i < thread.length; i++) {
            if (i % 2 == 0) {
                thread[i] = new Thread(squadraA);
            } else {
                thread[i] = new Thread(squadraB);
            }
        }

        for (Thread elem : thread) {
            if(!vincitore){
                elem.start();
            }else{
                break;
            }
        }

    }
}
