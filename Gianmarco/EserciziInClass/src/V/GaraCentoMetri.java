package V;
import java.util.concurrent.Semaphore;

/*
Scrivi un programma in Java che simuli una corsa di 100 metri tra 2 squadre, A e B.
Ogni squadra è composta da 4 corridori. Ogni corridore deve attraversare una sezione
critica rappresentata da un tratto di 25 metri.

 */
public class GaraCentoMetri implements Runnable {
    private static Semaphore semaphore1 = new Semaphore(1);
    private int metriPercorsiA;
    private int metriPercorsiB;
    private String team;

    public GaraCentoMetri() {
        this.metriPercorsiA = 0;
        this.metriPercorsiB = 0;

    }

    @Override
    public void run() {

    }



    public static void main(String[] args) {
        Thread[] threadA1=new Thread[8];

    }
}