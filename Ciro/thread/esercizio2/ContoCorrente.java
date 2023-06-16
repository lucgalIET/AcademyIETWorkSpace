package Ciro.thread.esercizio2;

import com.sun.jdi.ThreadReference;

import java.util.concurrent.Semaphore;

public class ContoCorrente {
    private Semaphore semaphore;
    private int saldoConto;
    private int soldi;

    public ContoCorrente(){
        this.semaphore = new Semaphore(1);
        saldoConto = 500;// apro un conto corrente con almeno 500€ disponibili
    }

    public synchronized void versamento(int soldi){
        try {
            System.out.println(Thread.currentThread().getName() +" Ha chiesto di effettuare un versamento di € " + soldi);
            semaphore.acquire();
            saldoConto += soldi;
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+ " ha effettuato il versamento di € " + soldi + " saldo disponibile € " + saldoConto);
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }

    public synchronized void prelievo(int soldi){
        try {
            System.out.println(Thread.currentThread().getName()+ " Ha chiesto di prelevare € " + soldi + " dal conto " );
            if(saldoConto < soldi) {
                System.out.println("disponibilità conto insufficiente ");
                return;
            }
            else{
                semaphore.acquire();
                saldoConto -= soldi;
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " ha prelevato € " + soldi + " nuova disponibilità " + saldoConto);
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }


    public static void main(String[] args) {
        ContoCorrente contoCorrente = new ContoCorrente();
        for(int i = 0; i < 2; i++){
            new Thread(()->{
                contoCorrente.versamento(100);
                contoCorrente.prelievo(200);

            }).start();
        }
    }
}


