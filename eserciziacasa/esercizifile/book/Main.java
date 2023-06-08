package eserciziacasa.esercizifile.book;

import eserciziacasa.esercizifile.product.Product;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Inserisci ISBN, Titolo e Autore: ");
        Book b1 = new Book(myScan.next(), myScan.next(), myScan.next());
        System.out.println("Inserisci ISBN, Titolo e Autore: ");
        Book b2 = new Book(myScan.next(), myScan.next(), myScan.next());
        System.out.println("Inserisci ISBN, Titolo e Autore: ");
        Book b3 = new Book(myScan.next(), myScan.next(), myScan.next());

        Map<String, Book> bookMap = new HashMap<>();

        bookMap.put(b1.getIsbn(), b1);
        bookMap.put(b2.getIsbn(), b2);
        bookMap.put(b3.getIsbn(), b3);

        Function<Book, String> function = (b) -> {
            String s = "ISBN: "+b.getIsbn();
            s += " | Titolo: "+b.getTitle();
            s += " | Autore: "+b.getAuthor()+"\n";
            return s;
        };

        BufferedWriter writer = new BufferedWriter(new FileWriter("eserciziacasa/esercizifile/book/text.txt"));
        for (Book b : bookMap.values()) {
            writer.write(function.apply(b));
        }
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("eserciziacasa/esercizifile/book/text.txt"));
        System.out.println("Inserisci il codice ISBN");
        String s = myScan.next();
        myScan.close();

        String regex = "ISBN: "+s;
        s = reader.readLine();
        while (s != null){
            if(s.contains(regex)){
                System.out.println(s);
            }
            s = reader.readLine();
        }
        reader.close();

    }
}
