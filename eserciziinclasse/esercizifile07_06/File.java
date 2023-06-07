package eserciziinclasse.esercizifile07_06;

import java.io.*;
import java.util.Scanner;

/*
* Scrivere su un file txt input da tastiera
* */
public class File {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        try{
            Writer writer = new FileWriter("eserciziinclasse/esercizifile07_06/file.txt");
            String s = myScan.next();
            while(!s.equals("X")){
                writer.write(s);
                writer.write("\n");
                s = myScan.next();
            }
            writer.close();
            myScan.close();

            Reader reader = new FileReader("eserciziinclasse/esercizifile07_06/file.txt");
            int s1 = reader.read();

            while(s1 != -1){
                System.out.print((char) s1);
                s1 = reader.read();
            }
            reader.close();

        } catch(IOException e){

        }
    }
}
