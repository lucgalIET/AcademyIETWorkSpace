package thread;

import java.sql.SQLOutput;
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
    private static Lock lock=new ReentrantLock();
    private static int metriPercorsiA;
    private static int metriPercorsiB;
    private  String team;

    public RunnerMain(String team) {
        this.team = team;


    }

    @Override
    public void run() {
        Random random=new Random();

                try{
                    System.out.println(Thread.currentThread().getName()+" sta iniziando la corsa");
                    Thread.sleep(random.nextInt(1000,3000));
                    semaphore.acquire();

                    lock.lock();
                        Thread.sleep(800);
                        if (team.equals("A")) {
                            metriPercorsiA += 25;
                            System.out.println(Thread.currentThread().getName()+" il team "+team+" ha percorso: "+metriPercorsiA);
                            if (metriPercorsiA >= 100)
                                System.out.println("il team " + team + " è arrivato");
                        } else if (team.equals("B")) {
                            metriPercorsiB += 25;
                            System.out.println(Thread.currentThread().getName()+" il team "+team+" ha percorso: "+metriPercorsiB);
                            if (metriPercorsiB >= 100)
                                System.out.println("il team " + team + " è arrivato");
                    }lock.unlock();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {

                    semaphore.release();

                }

            }




    public static void main(String[] args) {
    Thread[] thread=new Thread[8];


        for(int i=0; i<8;i++){
            if(i<4){
           thread[i]=new Thread(new RunnerMain("A"));
            }else{
                thread[i]=new Thread(new RunnerMain("B"));
            }
        }

        for(Thread t: thread){
            t.start();
        }


    }
}
 /*
    Random random=new Random();
                int metriIniziali=0;

                try{
                    System.out.println(Thread.currentThread().getName()+" sta iniziando la corsa");
                    semaphore.acquire();


                    while (metri <= metriPercorsiA) {
                        metriIniziali++;
                        if(metriIniziali>25) {
                            Thread.sleep(random.nextInt(1000, 5000));
                            if(metri<=100)
                                System.out.println(team + " ha percorso " + metri + " metri");


                            if (metri == 100) {

                                System.out.println("il corridore " + team + " ha vinto ");

                                metri++;

                            } else {
                                metri+=25;
                                Thread.sleep(2000);
                            }
                        }
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {

                    semaphore.release();
                }

*/