package manuel.eserciziacasa.esercizithread;

import java.util.Scanner;

public class Banca implements Runnable {
    private double conto = 0;
    public Banca() {
    }

    @Override
    synchronized public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("CONTO ATTUALE: "+conto);
        Scanner myScan = new Scanner(System.in);
        System.out.println("Seleziona P per prelevare o D per depositare");
        String s = myScan.next();
        if(s.equals("P")){
            System.out.println("Quanto vuoi prelevare? ");
            double soldi = myScan.nextDouble();
            if(soldi <= 0) return;
            else if(soldi > conto) {
                System.out.println("Denaro insufficiente");
                return;
            }
            conto -= soldi;
        } else if (s.equals("D")) {
            System.out.println("Quanto vuoi depositare? ");
            double soldi = myScan.nextDouble();
            if(soldi <= 0) return;
            conto += soldi;
        }

    }

    public static void main(String[] args) {
        Banca banca = new Banca();
        Thread thread1 = new Thread(banca);
        Thread thread2 = new Thread(banca);
        thread1.start();
        thread2.start();
    }
}
