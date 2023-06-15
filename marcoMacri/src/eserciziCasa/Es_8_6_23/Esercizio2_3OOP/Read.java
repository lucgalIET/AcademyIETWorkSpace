package marcoMacri.src.eserciziCasa.Es_8_6_23.Esercizio2_3OOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface Read {

    public static void read(String inputFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String fraseLetta = bufferedReader.readLine();
        System.out.println("Il file contiene-> "+fraseLetta);
    }

}
