package perCasa.Esercizi_08_06_2023.Esercizio2;

/*
Scrivi un programma Java che crea una classe Product con i campi id (identificatore), name e price.
Il programma chiede all'utente di inserire i dati di tre prodotti e li salva in una lista di oggetti Product.
Successivamente, scrivi i dati della lista su un file di testo e leggi il file per visualizzare i prodotti sullo schermo.
bonus:utilizzo di map
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Map<String, Double> mapProducts = new HashMap<>();
        List<Product> productList = new ArrayList<>();
        Scanner nameScan = new Scanner(System.in);
        Scanner priceScan = new Scanner(System.in);
        int count = 0;
        String name = "";
        double price = 0.0;

        do {
            System.out.println("Inserire un prodotto!");
            System.out.println("Inserire il nome del prodotto:");
            name = nameScan.nextLine();
            System.out.println("Inserire il prezzo del prodotto:");
            price = priceScan.nextDouble();
            System.out.println("-------------------------------------\n");
            Product product = new Product(name, price);
            productList.add(product);
            count++;
        } while (!(count == 3));

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("prodotti.txt"));
            productList.stream().forEach(x -> {
                try {
                    bufferedWriter.write(x.getName() + ", ");
                    bufferedWriter.write(x.getPrice() + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("prodotti.txt"));
            String row = bufferedReader.readLine();
            while (row != null) {
                System.out.println(row);
                row = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
