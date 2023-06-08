package esercizi.src.eserciziCasa.Es_8_6_23.Esercizio2_3OOP;

import esercizi.src.eserciziCasa.Es_8_6_23.Book;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MiniBibblioteca extends AbstractInserisciValore{
    public static void main(String[] args) throws IOException {

        Map<String, Book> libri = new TreeMap<>();
        boolean inserisci = true;
        while(inserisci) {
            System.out.println("Inserisci L'Isbn deve contenere solo numeri: ");
            int isbn =inserisciValoreNumerico();
            System.out.println("Inserisci il titolo deve contenere solo lettere e numeri: ");
            String titolo = inserisciStringa();
            System.out.println("Inserisci il nome dell'autore deve contenere solo lettere: ");
            String autore = inserisciStringa();
            libri.put(titolo,new Book(isbn,titolo,autore));
            System.out.println("Vuoi inserire un altro prodotto? (si/no)");
            Scanner scanner = new Scanner(System.in);
            String continuare = scanner.nextLine();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("libri.txt"));
            bufferedWriter.write("Libro: "+isbn+" "+autore+ " "+ titolo+"\n");
            bufferedWriter.close();
            switch (continuare) {
                case "si" -> {
                }
                case "no" -> inserisci = false;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader("libri.txt"));
            String fraseLetta = bufferedReader.readLine();
            System.out.println("Il file contiene-> "+fraseLetta);



        }}
    }

