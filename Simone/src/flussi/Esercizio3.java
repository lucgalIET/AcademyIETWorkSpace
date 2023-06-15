package flussi;

import java.io.*;
import java.util.*;

/*
Scrivi un programma Java che crea una classe Book con i campi isbn, title e author.
Il programma chiede all'utente di inserire i dati di tre libri
 e li salva in una mappa di oggetti Book, utilizzando l'ISBN come chiave.
Successivamente, scrivi i dati della mappa su un file di testo e leggi il file
per estrarre e visualizzare i libri in base all'ISBN inserito dall'utente.

 */
public class Esercizio3 {
    public static void main(String[] args) {
        Map<String, Book> mapBook = new HashMap<>();

        Scanner mioScanner = new Scanner(System.in);

        System.out.println("inserisci i dati del primo libro: ");
        Book book1 = new Book(mioScanner.nextLine(), mioScanner.nextLine(), mioScanner.nextLine());
        System.out.println("inserisci i dati del secondo libro: ");
        Book book2 = new Book(mioScanner.nextLine(), mioScanner.nextLine(), mioScanner.nextLine());
        System.out.println("inserisci i dati del terzo libro: ");
        Book book3 = new Book(mioScanner.nextLine(), mioScanner.nextLine(), mioScanner.nextLine());
        mapBook.put(book1.getIsbn(), book1);
        mapBook.put(book2.getIsbn(), book2);
        mapBook.put(book3.getIsbn(), book3);
        System.out.println(mapBook);


        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("mappa.txt"));
            bufferedWriter.write(mapBook.toString());
            bufferedWriter.close();




            BufferedReader bufferedReader = new BufferedReader(new FileReader("mappa.txt"));
            System.out.println("Inserisci il codice ISBN da cercare");
            String parolaDaCercare = mioScanner.nextLine();

            String line = bufferedReader.readLine();
            while (line != null){
                if(line.contains(parolaDaCercare)){
                    System.out.println(line);
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        mioScanner.close();
    }
}