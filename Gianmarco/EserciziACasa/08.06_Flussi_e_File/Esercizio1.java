import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Scrivi un programma Java che chiede all'utente di
inserire una frase e la scrive su un file di testo.
Successivamente, leggi il contenuto del file e
 visualizzalo sullo schermo.
 */
public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci la tua frase");
        String frase = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write(frase);
            writer.close();

        } catch (IOException exception) {
            throw new RuntimeException();
        }


        try (FileReader fileReader = new FileReader("file.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException exception) {
            throw new RuntimeException();
        }


    }
}
