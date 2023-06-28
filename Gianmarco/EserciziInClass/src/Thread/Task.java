package Thread;

import java.util.concurrent.Semaphore;

/*

 */
public class Task implements Runnable {
    private Semaphore semaphore;
    private String stringa;

    public Task(Semaphore semaphore, String stringa) {
        this.semaphore = semaphore;
        this.stringa = stringa;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " " + stringa);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        } finally {
            semaphore.release();
        }

    }

    public static void main(String[] args) {

        Task task = new Task(new Semaphore(1), "ciao");

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
