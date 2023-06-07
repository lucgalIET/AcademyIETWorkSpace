package eserciziacasa.esercizifunctionalinterface;

public class Esercizio4 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        };

        runnable.run();
    }
}
