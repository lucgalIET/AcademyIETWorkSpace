package perCasa.esercizi_01_06_2023;

//4.Implementa un Runnable che esegue un conteggio progressivo da 1 a 10.
// [bonus]stampando ogni numero dopo un breve ritardo. (classe Thread)

public class Esercizio4 {

    public static void main(String[] args) {

        Runnable runnable = ()->{
            int count = 1;
            Thread thread = new Thread();
            while(count <= 10){
                System.out.println("Numero: "+ count);
                count++;
                try {
                    thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };

        runnable.run();
    }
}
