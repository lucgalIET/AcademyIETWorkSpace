package Ciro.thread.connection;


import java.util.concurrent.Semaphore;

public class Connection {
    private Semaphore semaphore;
    private int connections=0;
    private int maxConnections;


    public Connection(int maxConnections) {
        semaphore = new Semaphore(maxConnections);
        this.maxConnections = maxConnections;

    }

    public void acquireConnections(){
        try {
            semaphore.acquire();
            connections+=1;
            System.out.println(Thread.currentThread().getName()+"Connection acquired! Total connections: "+ connections);
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void releaseConnection(){
        semaphore.release();
        connections-=1;
        System.out.println(Thread.currentThread().getName() +
                "Connection released! Total: "+ connections);
    }


    public static void main(String[] args) {
        Connection connection =new Connection(1);
        for(int i = 0;i<10;i++){
            new Thread(()->{
                connection.acquireConnections();
                connection.releaseConnection();
            }).start();
        }
    }
}