package es3;

import es2.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Book> bookMap = new HashMap<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Inserisci i dati del libro n° " + i);

            System.out.println("ISBN:");
            int ISBN = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Titolo:");
            String Titolo = scanner.nextLine();
            System.out.println("Autore:");
            String Autore = scanner.nextLine();

            Book book = new Book(ISBN, Titolo, Autore);
            bookMap.put(ISBN, book);

        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("libri.txt"))){
            writer.write(bookMap.toString());

        }catch (IOException exception) {
            throw new RuntimeException();
        }


    }
}
