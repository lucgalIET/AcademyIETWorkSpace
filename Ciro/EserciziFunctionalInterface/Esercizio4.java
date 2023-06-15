package Ciro.EserciziFunctionalInterface;
/*
Implementa un Runnable che esegue un conteggio progressivo da 1 a 10.
[bonus]stampando ogni numero dopo un breve ritardo. (classe Thread)
 */
public class Esercizio4 {

        public static void main(String[] args) {
             Runnable runnable = ()->{
                for(int i = 1; i <= 10; i++){
                    System.out.println(i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
            runnable.run();
        }
    }

