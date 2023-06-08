package EserciziCasa_04_06_23.FlussiEFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Esercizio2FlussieFile {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("numeri.bin");
            int dato = inputStream.read();
            while (dato != -1) {
                System.out.print(dato);
                dato = inputStream.read();
            }
            inputStream.close();

        } catch (IOException exception) {
            throw new RuntimeException();
        }
    }
}
