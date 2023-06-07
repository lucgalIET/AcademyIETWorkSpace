package esercizi.src.eserciziLezione;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EsercizioCarino {
    public static void main(String[] args) throws IOException {
//        FileReader fileReader = new FileReader("dati.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("dati.txt"));
        String dato = bufferedReader.readLine();
        System.out.println(dato);
        String[] dati = dato.split(" ");
        Map<String,Integer> map =new TreeMap<>();
        for (int i = 0; i < dati.length; i+=2){
            map.put(dati[i],Integer.parseInt(dati[i+1]));
        }
        bufferedReader.close();
        System.out.println(map);

    }
}
