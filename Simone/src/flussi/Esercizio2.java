package flussi;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/*
Scrivi un programma Java che crea una classe Product con i campi id (identificatore), name e price.
Il programma chiede all'utente di inserire i dati di tre prodotti e li salva in una lista di oggetti Product.
Successivamente, scrivi i dati della lista su un file di testo e leggi il file per visualizzare i prodotti sullo schermo.
bonus:utilizzo di map
 */
public class Esercizio2 {
    public static void main(String[] args) {
        List<Product> listaProdotti= Arrays.asList(
                new Product("CISAE10","Latte", 12),
                new Product("FGSWR12","Biscotti", 3),
                new Product("DDSFC34","Cereali", 5),
                new Product("DFDDS22","Pizza", 5)
        );
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("listaSpesa.txt"));
            listaProdotti.stream().forEach(prodotto -> {
                try {
                    bufferedWriter.write(prodotto.getId()+", ");
                    bufferedWriter.write(prodotto.getNome()+", ");
                    bufferedWriter.write( String.valueOf(prodotto.getPrezzo()));
                    bufferedWriter.newLine();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            bufferedWriter.close();

            BufferedReader bufferedReader=new BufferedReader(new FileReader("listaSpesa.txt"));
            String line=bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        }catch(IOException e){
            throw new RuntimeException();
        }

    }
}
