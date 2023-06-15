package manuel.eserciziacasa.esercizithread;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Gara implements Runnable{

    private Lock lock = new ReentrantLock();
//    private int counter = 1;
    private List<Thread> classifica = new ArrayList<>();
    private int punteggio = 0;
    public Gara() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lock.lock();
            while(i>50 && i<75){
                i++;
//                System.out.println(Thread.currentThread().getName());
            }
            lock.unlock();
        }
//        System.out.println(Thread.currentThread().getName());
        classifica.add(Thread.currentThread());
    }

    public void stampaClassifica(){
        for (int i = 0; i < 8; i++) {
            System.out.println(i+1 +" Classificato " + classifica.get(i).getName());
            if(classifica.get(i).getName().contains("A")) punteggio += 8-i;
        }
        if (punteggio>18) System.out.println("Squadra A vincitrice");
        else if(punteggio == 18) System.out.println("Pareggio");
        else System.out.println("Squadra B vincitrice");
    }

    public static void main(String[] args) {
        Gara gara = new Gara();
        Map<Thread, Integer> threadMap = new HashMap<>();
        for (int i = 1; i < 5; i++) {
            threadMap.put(new Thread(gara,i+"A"),0);
        }
        for (int i = 5; i < 9; i++) {
            threadMap.put(new Thread(gara,i+"B"),0);
        }
        for (Thread t : threadMap.keySet()) {
            t.start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        gara.stampaClassifica();

    }
}
