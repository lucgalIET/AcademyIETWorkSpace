package inClasse.esercizi_7_6_2023;

import java.io.*;

public class Esercizio {

    public static void main(String[] args) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));
            bufferedWriter.write("Quello che ti pare senza problemi del mento eee");
            bufferedWriter.newLine();
            bufferedWriter.write("anarchia di scritturaaaaaaaaaaaaa");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
            String s = (bufferedReader.readLine());
            String risultato = "";
            while (s != null) {
                risultato += s;
                s = bufferedReader.readLine();
            }

            int count1 = 0;
            int contaOccorrenze = 0;
            String occ = "";
            char c = 0;
            for (int i = 0; i < risultato.length() - 1; i++) {
                contaOccorrenze = 1;
                if (!occ.contains(Character.toString(risultato.charAt(i)))) {
                    occ += Character.toString(risultato.charAt(i));
                    for (int j = i + 1; j < risultato.length(); j++) {
                        if (risultato.charAt(i) == risultato.charAt(j) && risultato.charAt(i) != ' ') {
                            contaOccorrenze++;

                        }
                    }
                } else {
                    continue;
                }
                if (contaOccorrenze > count1) {
                    count1 = contaOccorrenze;
                    c = risultato.charAt(i);
                }
            }
            bufferedReader.close();

            BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("file1.txt"));
            bufferedWriter1.write("Il carattere con il maggior numero di occorrenze è: '" + c + "' ed ha " + count1 + " occorrenze");
            bufferedWriter1.close();

            /*int count = 0;
            for (int i = 0; i < risultato.length(); i++) {
                if (!(risultato.charAt(i) == ' ')) {
                    count++;
                }
            }
            bufferedReader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("risultato.txt"));
            writer.write("Il numero di caratteri è : " + count);
            writer.close();*/

        } catch (
                IOException e) {
            throw new RuntimeException();
        }
    }
}
