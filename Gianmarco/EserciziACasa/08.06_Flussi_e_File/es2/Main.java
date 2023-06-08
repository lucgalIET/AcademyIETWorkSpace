package es2;

/*
Scrivi un programma Java che crea una classe Product con
i campi id (identificatore), name e price.
Il programma chiede all'utente di inserire i dati di tre
prodotti e li salva in una lista di oggetti Product.
Successivamente, scrivi i dati della lista su un file
di testo e leggi il file per visualizzare i prodotti
sullo schermo. bonus:utilizzo di map
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<Product> listaProdotti = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Inserisci i dati del prodotto n° " + i);

            System.out.println("Codice id:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nome:");
            String nome = scanner.nextLine();

            System.out.println("Prezzo:");
            double prezzo = scanner.nextDouble();

            Product product = new Product(id, nome, prezzo);
            listaProdotti.add(product);
        }

        /*System.out.println("Elenco dei prodotti inseriti:");
        for (Product product : listaProdotti) {
            System.out.println("ID: " + product.getId());
            System.out.println("Nome: " + product.getName());
            System.out.println("Prezzo: " + product.getPrice());
            System.out.println("-----------------------------");
        }*/

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("es2.txt"))) {

            for (Product product:listaProdotti) {
                writer.write(product.toString());
                writer.newLine();
                writer.write("---------------------");
                writer.newLine();
                }

        }catch(IOException exception){
            throw new RuntimeException();
        }

        try(FileReader fileReader = new FileReader("es2.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException exception) {
            throw new RuntimeException();
        }

    }
}
