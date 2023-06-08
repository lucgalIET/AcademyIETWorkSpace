package EsercizioPianeti.flussi;

import java.io.*;
import java.util.Scanner;

/*
Scrivi un programma Java che chiede all'utente di inserire una frase e la scrive su un file di testo.
Successivamente, leggi il contenuto del file e visualizzalo sullo schermo.
 */
public class Esercizio1 {
    public static void main(String[] args) {
        Scanner mioScanner= new Scanner(System.in);
        String frase=mioScanner.nextLine();

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("frase.txt"));
            bufferedWriter.write(frase);
            bufferedWriter.close();

            BufferedReader bufferedReader=new BufferedReader(new FileReader("frase.txt"));
            String line=bufferedReader.readLine();
            System.out.println(line);
            bufferedReader.close();

        }catch(IOException e){
            throw new RuntimeException();
        }
        mioScanner.close();
    }
}
