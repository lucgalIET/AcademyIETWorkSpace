package eserciziPerCasa.thread;
import java.util.concurrent.Semaphore;

    public class Connection {
        private Semaphore semaforo;
        private int connections=0;
        private int maxConnections;

        public Connection(int maxConnections) {
            semaforo = new Semaphore(maxConnections);
        }

        public void acquireConnections(){
            try {
                semaforo.acquire();
                connections++;
                System.out.println(Thread.currentThread().getName() + " acquisizione ottenuta. Totale acquisizioni attive: " + connections);
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }

        public void releaseConnections(){
            try {
                connections--;
                semaforo.release();
                System.out.println(Thread.currentThread().getName() + " acquisizione rilasciata " + connections);
                Thread.sleep(3000);

            }catch(InterruptedException e ){
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            Connection connessione= new Connection(1);
            for(int i=0;i<10;i++){
                new Thread(() -> {
                    connessione.acquireConnections();
                    connessione.releaseConnections();
                }).start();
            }
        }
    }
