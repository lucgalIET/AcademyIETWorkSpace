package Ciro.esercizi_flussi_file.eserciio1;

import java.io.*;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            //inseriamo la frase da input e la scriviamo nel file di testo
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Ciro/esercizi_flussi_file/eserciio1/file.txt"));

            System.out.print("Inserisci una frase : ");
            String frase = input.nextLine();

            bufferedWriter.write(frase);
            bufferedWriter.close();

            //leggiamo la frase inserita nel file di testo e la visualizziomo
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Ciro/esercizi_flussi_file/eserciio1/file.txt"));
            String frase1 = bufferedReader.readLine();
            System.out.println("La frase inserita nel file e' : " + frase1);

            bufferedReader.close();
        }catch(IOException e){
            throw new RuntimeException();
        }





    }



}
