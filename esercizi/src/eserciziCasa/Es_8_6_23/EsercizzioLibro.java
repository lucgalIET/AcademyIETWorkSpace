package esercizi.src.eserciziCasa.Es_8_6_23;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



//Esercizio 3:
//        Scrivi un programma Java che crea una classe Book con i campi isbn, title e author.
//        Il programma chiede all'utente di inserire i dati di tre libri e li salva in una mappa di oggetti Book, utilizzando l'ISBN come chiave.
//        Successivamente, scrivi i dati della mappa su un file di testo e leggi il file per estrarre e visualizzare i libri in base all'ISBN inserito dall'utente.
public class EsercizzioLibro {
    public static void main(String[] args) throws IOException {
//        Product product = new Product();
        Map<String,Book> libri = new TreeMap<>();
        boolean inserisci = true;
        while(inserisci) {
            int isbn = inserisciIsbn();
            String titolo = inserisciTitolo();
            String autore = inserisciAutore();
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
    private static int inserisciIsbn(){
        boolean valoreCorretto=false;
        String valore="";
        while (!valoreCorretto){

            System.out.println("Inserici l'ISBN del prodotto (deve contenere solo valori numerici)");
            Scanner scanner = new Scanner(System.in);
            valore = scanner.nextLine();
            valoreCorretto = valore.matches("[0-9]+");
            scanner.close();
            if (!valoreCorretto){
                System.out.println("Il valore non contiene solo numeri!");
            }

        }

        return  Integer.parseInt(valore);}
    private static String inserisciTitolo(){
        boolean valoreCorretto=false;
        String valore="";
        while (!valoreCorretto){

            System.out.println("Inserici il nome del prodotto (puo' contenere solo lettere e numeri)");
            Scanner scanner = new Scanner(System.in);
            valore = scanner.nextLine();
            valoreCorretto = valore.matches("[a-zA-Z0-9]+");
            scanner.close();
            if (!valoreCorretto){
                System.out.println("Il valore non contiene solo lettere e numeri!");
            }

        }

        return  valore;}
    private static String inserisciAutore(){
        boolean valoreCorretto=false;
        String valore="";
        while (!valoreCorretto){

            System.out.println("Inserici l'autore del libro (deve contenere solo lettere)");
            Scanner scanner = new Scanner(System.in);
            valore = scanner.nextLine();
            valoreCorretto = valore.matches("[a-zA-Z]+");
            scanner.close();
            if (!valoreCorretto){
                System.out.println("Il valore non contiene solo lettere!");
            }

        }
        return  valore;}
}




