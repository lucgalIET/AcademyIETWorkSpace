package manuel.eserciziacasa.esercizithread;

public class Banca {
    private double conto = 0;

    public Banca() {
    }

    public synchronized void deposito(double soldi){
        if(soldi <= 0) return;
        conto += soldi;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void prelievo(double soldi){
        if(soldi <= 0) return;
        else if(soldi > conto) {
            System.out.println("Denaro insufficiente");
            return;
        }
        conto -= soldi;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        Banca banca = new Banca();
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();


    }




//    @Override
//    synchronized public void run() {
//
//    }
}
