package esercizi.src.eserciziLezione;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class EsercizioQuasiBello {
    // scriviamo all'interno di un file txt dei dati estratti da un oggetto
    public static void main(String[] args) throws IOException {
        List<Persona> persone = Arrays.asList(
                new Persona("Ciccio", 12),
                new Persona("Pluto", 22),
                new Persona("Papero", 47),
                new Persona("Melone", 77),
                new Persona("Ciliegie", 34),
                new Persona("Fragole", 45),
                new Persona("GiacomoGiacomo", 23),
                new Persona("Franco", 55),
                new Persona("Paolo", 44),
                new Persona("Sonia", 27),
                new Persona("Zelda", 21)
        );
        FileWriter file = new FileWriter("dati.txt");

        persone.stream().forEach(stringa-> {
            try {
                file.write(stringa.getNome());
                file.write(" "+stringa.getEta()+" ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

   file.close(); }


}
