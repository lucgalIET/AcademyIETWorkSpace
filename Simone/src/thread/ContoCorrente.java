package thread;

import java.util.concurrent.Semaphore;

/*
Scrivi un programma in Java che simuli la condivisione di un conto corrente tra due thread che effettuano prelievi e depositi.
Utilizza sia un oggetto di blocco che il modificatore synchronized per sincronizzare il blocco di codice critico.
(e' possibile utilizzare 'synchronized' anche nella firma dei metodi)
 */
public class ContoCorrente {

    private Semaphore semaforo;
    private static int soldi=1000;

    public ContoCorrente() {
        this.semaforo = new Semaphore(1);
    }

    public synchronized void depositaSoldi(){

        try{
            System.out.println(Thread.currentThread().getName()+" Richiesta deposito, soldi attuali "+soldi);
            semaforo.acquire();
            soldi+=100;
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+ " Saldo dopo il deposito "+ soldi);
            Thread.sleep(2000);


        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            semaforo.release();
        }
    }

    public synchronized void prelevaSoldi(){
        try {
            semaforo.acquire();
            soldi-=50;

            System.out.println(Thread.currentThread().getName() + " Soldi prelevati, saldo attuale " + soldi);
            Thread.sleep(1000);

        }catch(InterruptedException e ){
            e.printStackTrace();
        }finally{
            semaforo.release();
        }

    }

    public static void main(String[] args) {
        ContoCorrente conto=new ContoCorrente();
        for(int i=0;i<2;i++){
            new Thread(() -> {
                conto.depositaSoldi();
                conto.prelevaSoldi();
            }).start();
        }

    }
}
