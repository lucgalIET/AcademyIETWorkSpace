package perCasa.esercizi_08_06_2023.Esercizio3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Scrivi un programma Java che crea una classe Book con i campi isbn, title e author.
Il programma chiede all'utente di inserire i dati di tre libri e li salva in una mappa di oggetti Book, utilizzando l'ISBN come chiave.
Successivamente, scrivi i dati della mappa su un file di testo e leggi il file per estrarre e visualizzare i libri in base all'ISBN inserito dall'utente.
*/
public class Main {

    public static void main(String[] args) {


        Map<Integer, Book> mapBooks = new HashMap<>();
        Scanner isbnScan = new Scanner(System.in);
        Scanner stringScan = new Scanner(System.in);
        int count = 0;
        int isbn = 0;
        String title = "";
        String author = "";

        do {
            System.out.println("Insert book!");
            System.out.println("Insert ISBN code:");
            isbn = isbnScan.nextInt();
            System.out.println("Insert book's title:");
            title = stringScan.nextLine();
            System.out.println("Insert book's author:");
            author = stringScan.nextLine();
            System.out.println("-------------------------------------\n");

            Book book = new Book(isbn, title, author);
            mapBooks.put(book.getIsbn(), book);
            count++;

        } while (count != 3);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("books.txt"));
            for (Map.Entry<Integer, Book> entry : mapBooks.entrySet()) {
                bufferedWriter.write("ISBN: " + entry.getKey() + " = " + entry.getValue() + "\n");
            }
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("books.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
