package inClasse.Esercizi_01_06_2023.Esercizi_7_6_2023;

import java.io.*;

public class Esercizio {

    public static void main(String[] args) {

        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));
            bufferedWriter.write("Quello che ti pare");
            bufferedWriter.newLine();
            bufferedWriter.write("anarchia di scrittura");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
            String s = (bufferedReader.readLine());
            String risultato = "";
            while(s != null){
                risultato += s;
                s = bufferedReader.readLine();
            }

            /*int count = 0;
            int contaOccorrenze = 0;
            for(int i = 0; i< risultato.length(); i++){
                contaOccorrenze = 0;
                for(int j = 0; j< risultato.length(); j++){
                    if()
                }
                */
            int count = 0;
            for(int i = 0; i< risultato.length(); i++){
                if(!(risultato.charAt(i) == ' ')){
                    count++;
                }
            }
            bufferedReader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("risultato.txt"));
            writer.write("Il numero di caratteri è : "+ count);
            writer.close();

        }catch(IOException e){
            throw new RuntimeException();
        }
    }
}
