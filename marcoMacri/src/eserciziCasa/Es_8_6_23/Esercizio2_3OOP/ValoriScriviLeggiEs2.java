package marcoMacri.src.eserciziCasa.Es_8_6_23.Esercizio2_3OOP;

import marcoMacri.src.eserciziCasa.Es_8_6_23.Product;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ValoriScriviLeggiEs2 extends AbstractInserisciValore implements Print,Read{
    public static void main(String[] args) throws IOException {
//        Product product = new Product();
        Map<String, Product> prodotti = new TreeMap<>();
        boolean inserisci = true;
        while(inserisci) {
            System.out.println("Inserici il valore dell'id del prodotto (deve contenere solo valori numerici)");
            double id = inserisciDouble();

            System.out.println("Inserici il nome del prodotto (puo' contenere solo lettere e numeri)");
            String nome = inserisciStringa();

            System.out.println("Inserici il prezzi del prodotto (deve contenere solo valori numerici)");
            int prezzo = inserisciValoreNumerico();

            prodotti.put(nome,new Product(id,nome,prezzo));

            System.out.println("Vuoi inserire un altro prodotto? (si/no)");
            Scanner scanner = new Scanner(System.in);
            String continuare = scanner.nextLine();

            Print.print("prodotti.txt","Pododotto: "+id+" "+nome+ " "+ prezzo+"\n");

            switch (continuare) {
                case "si" -> {
                }
                case "no" -> inserisci = false;
            }

            Read.read("prodotti.txt");



        }}
}
