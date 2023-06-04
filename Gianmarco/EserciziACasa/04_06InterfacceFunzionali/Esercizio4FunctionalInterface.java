package EserciziCasa_04_06_23;

public class Esercizio4FunctionalInterface {
    public static void main(String[] args) {

        Runnable runnable=()->{
           for(int i = 1; i<11; i++) {
               System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
