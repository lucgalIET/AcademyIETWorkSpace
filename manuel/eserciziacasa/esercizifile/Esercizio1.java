package manuel.eserciziacasa.esercizifile;

import java.io.*;
import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) throws IOException {
        Scanner myScan = new Scanner(System.in);
        String s;

        s = myScan.nextLine();
        myScan.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("eserciziacasa/esercizifile/text.txt"));

        writer.write(s);
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("eserciziacasa/esercizifile/text.txt"));
        s = reader.readLine();
        while(s != null) {
            System.out.println(s);
            s = reader.readLine();
        }
        reader.close();
    }
}
