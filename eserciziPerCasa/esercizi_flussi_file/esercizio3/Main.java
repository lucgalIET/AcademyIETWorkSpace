package eserciziPerCasa.esercizi_flussi_file.esercizio3;

import eserciziPerCasa.esercizi_flussi_file.eserciio2.Product;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Integer isbn = 0;

    public static void main(String[] args) {


        Map<Integer, Book> mappaBook = new HashMap<>();

        Scanner input = new Scanner(System.in);

//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Inserisci libro");
//            System.out.print("titolo : ");
//            String title = input.nextLine();
//            System.out.print("autore : ");
//            String author = input.nextLine();
//
//            Book book = new Book(isbn,title,author);
//            isbn++;
//            mappaBook.put(isbn, book);
//        }
//        System.out.println("Visualizzazione della mappa di book");
//        for (Map.Entry<Integer, Book> mappa : mappaBook.entrySet()) {
//            System.out.print(mappa.getKey() + " ");
//            System.out.print(mappa.getValue().getTitle() + " ");
//            System.out.println(mappa.getValue().getAuthor());
//        }

        try {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("eserciziPerCasa/esercizi_flussi_file/esercizio3/book.txt"));
//            for (Map.Entry<Integer, Book> mappa : mappaBook.entrySet()) {
//                Integer isbn = mappa.getKey();
//                bufferedWriter.write(isbn+ " ");
//                String n = mappa.getValue().getTitle();
//                bufferedWriter.write(n + " ");
//                String p = mappa.getValue().getAuthor();
//                bufferedWriter.write(p + "\n");
//
//            }
//            bufferedWriter.close();
//            input.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("eserciziPerCasa/esercizi_flussi_file/esercizio3/book.txt"));
//            String book = bufferedReader.readLine();
//            System.out.println("-------------------------------");
//            System.out.println("Visualizzazione book presenti sul file");
//            while (book != null) {
//                System.out.println(book);
//                book = bufferedReader.readLine();
//            }

           System.out.println("Inserisci ISBN del libro da visualizzare ");
           Integer isbnInput = input.nextInt();
           String s = bufferedReader.readLine();
           int cont = 1;
           boolean trovato = false;

           while (s!=null && !trovato){
              if(cont == isbnInput){
                  trovato = true;
                  break;
              }else {
                  s = bufferedReader.readLine();
                  cont++;
              }
           }
           if(!trovato)
               System.out.println("Libro non presente nel file");
            else System.out.println(s);


            bufferedReader.close();


        } catch (
                IOException e) {
            throw new RuntimeException();
        }
    }
}


