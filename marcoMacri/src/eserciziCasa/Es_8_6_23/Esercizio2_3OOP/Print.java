package marcoMacri.src.eserciziCasa.Es_8_6_23.Esercizio2_3OOP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public interface Print {
    public static void print(String outputName, String data) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputName));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }
}
