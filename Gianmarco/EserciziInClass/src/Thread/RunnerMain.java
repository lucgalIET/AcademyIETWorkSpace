package Thread;

import java.util.concurrent.Semaphore;

/*
Scrivi un programma in Java che simuli una corsa di 100 metri tra 2 squadre, A e B.
Ogni squadra è composta da 4 corridori. Ogni corridore deve attraversare una sezione
critica rappresentata da un tratto di 25 metri.

 */
/*
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
*/








/*
Scrivi un programma in Java che simuli una corsa di 100 metri tra 2 squadre, A e B.
Ogni squadra è composta da 4 corridori. Ogni corridore deve attraversare una sezione
critica rappresentata da un tratto di 25 metri.
*/

public class RunnerMain implements Runnable {
    private static Semaphore semaphore = new Semaphore(1);
    private static int metriPercorsiA = 0;
    private static int metriPercorsiB = 0;
    private String team;
    private int velocita;

    public RunnerMain(String team, int velocita) {
        this.team = team;
        this.velocita = velocita;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            for (int i = 0; i < 25; i++) {
                Thread.sleep(velocita);
                if (team.equals("A")) {
                    metriPercorsiA++;
                } else if (team.equals("B")) {
                    metriPercorsiB++;
                }
                System.out.println("Corridore " + team + " ha percorso " + (metriPercorsiA +" " + metriPercorsiB) + " metri.");
            }
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread[] threadA = new Thread[4];
        Thread[] threadB = new Thread[4];

        for (int i = 0; i < 4; i++) {
            RunnerMain runnerA = new RunnerMain("A", (int) (Math.random() * 5) + 10);
            RunnerMain runnerB = new RunnerMain("B", (int) (Math.random() * 5) + 10);
            threadA[i] = new Thread(runnerA);
            threadB[i] = new Thread(runnerB);
            threadA[i].start();
            threadB[i].start();
        }

        System.out.println("La corsa è terminata");

        if (metriPercorsiA > metriPercorsiB) {
            System.out.println("La squadra A ha vinto con un punteggio totale di " + metriPercorsiA + " metri.");
        } else if (metriPercorsiB > metriPercorsiA) {
            System.out.println("La squadra B ha vinto con un punteggio totale di " + metriPercorsiB + " metri.");
        } else {
            System.out.println("La corsa si è conclusa in pareggio con un punteggio totale di " + metriPercorsiA + " metri.");
        }
    }
}


