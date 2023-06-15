package marcoMacri.src.eserciziCasa.Es_8_6_23;

import java.io.*;
import java.util.Scanner;

//Esercizio 1:
//
//        Scrivi un programma Java che chiede all'utente di inserire una frase e la scrive su un file di testo.
//        Successivamente, leggi il contenuto del file e visualizzalo sullo schermo.
public class EsercizioScriviLeggiFrase {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una frase da salvare-> ");
        String frase = scanner.nextLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        bufferedWriter.write(frase);
        bufferedWriter.close();
        scanner.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"));
        String fraseLetta = bufferedReader.readLine();
        System.out.println("Il file contiene-> "+fraseLetta);
    }
}
