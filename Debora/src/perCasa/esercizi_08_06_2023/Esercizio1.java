package perCasa.esercizi_08_06_2023;

/*
Scrivi un programma Java che chiede all'utente di inserire una frase e la scrive su un file di testo.
Successivamente, leggi il contenuto del file e visualizzalo sullo schermo.
*/

import java.io.*;
import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una frase: ");
        String frase = in.nextLine();

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("fraseUtente.txt"));
            writer.write(frase);
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("fraseUtente.txt"));
            System.out.println(reader.readLine());
            reader.close();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}
