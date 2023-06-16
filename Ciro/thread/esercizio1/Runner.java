package Ciro.thread.esercizio1;

import java.util.concurrent.Semaphore;
/*
Scrivi un programma in Java che simuli una corsa di 100 metri tra 2 squadre, A e B.
Ogni squadra è composta da 4 corridori. Ogni corridore deve attraversare una sezione
critica rappresentata da un tratto di 25 metri.

*/
public class Runner implements Runnable{

      private static final Semaphore semaphore = new Semaphore(1);
        private int metriPercorsiA;
        private int metriPercorsiB;
        private String team;

        public Runner() {
            this.metriPercorsiA = 0;
            this.metriPercorsiB = 0;

        }

        @Override
        public void run() {


        }



        public static void main(String[] args) {
            Thread[] threadA1 = new Thread[4];
            Thread[] threadA2 = new Thread[4];

            Runner runner = new Runner();

            //threadA1[0].start();
        }
}