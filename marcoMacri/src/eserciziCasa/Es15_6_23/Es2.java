package marcoMacri.src.eserciziCasa.Es15_6_23;

//Esercizio 2:
//        Scrivi un programma in Java che simuli la condivisione di un conto corrente tra due thread che effettuano prelievi e depositi.
//        Utilizza sia un oggetto di blocco che il modificatore synchronized per sincronizzare il blocco di codice critico.
//        (e' possibile utilizzare 'synchronized' anche nella firma dei metodi)

import java.util.concurrent.Semaphore;

public class Es2 implements Runnable {
    private Semaphore semaphore;
    private String stringa;

    public Es2(Semaphore semaphore, String stringa) {
        this.semaphore = semaphore;
        this.stringa = stringa;
    }

    @Override
    public void run() {
        try {

//            semaphore.acquire();
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName() + " " + stringa);}
        } finally {
//            semaphore.release();
        }

    }

    public static void main(String[] args) {

        Es2 task = new Es2(new Semaphore(1), "Deposito Effettuato");
        Es2 task1 = new Es2(new Semaphore(1), "Prelievo Effettuato");
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task1);


        thread1.start();
        thread2.start();


    }}