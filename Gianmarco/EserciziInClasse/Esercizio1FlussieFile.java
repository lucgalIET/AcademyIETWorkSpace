package EserciziCasa_04_06_23;

/*
scriviamo un file.bin e il programma deve scriverci 10 numeri casuali.

 */


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class Esercizio1FlussieFile {

    public static void main(String[] args) {
        Random random = new Random();
        try {
            OutputStream outputStream = new FileOutputStream("numeri.bin");

            for (int i = 0; i < 10; i++) {
                outputStream.write(random.nextInt(48, 57));
                if(i<9) outputStream.write(44);

            }
            outputStream.close();
        } catch (IOException exception) {
            throw new RuntimeException();
        }

    }
}
