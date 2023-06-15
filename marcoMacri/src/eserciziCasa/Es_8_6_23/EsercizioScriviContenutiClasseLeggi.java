package marcoMacri.src.eserciziCasa.Es_8_6_23;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Esercizio 2:
//        Scrivi un programma Java che crea una classe Product con i campi id (identificatore), name e price.
//        Il programma chiede all'utente di inserire i dati di tre prodotti e li salva in una lista di oggetti Product.
//        Successivamente, scrivi i dati della lista su un file di testo e leggi il file per visualizzare i prodotti sullo schermo.
//        bonus:utilizzo di map
public class EsercizioScriviContenutiClasseLeggi {

    public static void main(String[] args) throws IOException {
//        Product product = new Product();
        EsercizioScriviContenutiClasseLeggi esercizioScriviContenutiClasseLeggi = new EsercizioScriviContenutiClasseLeggi();
        Map<String,Product> prodotti = new TreeMap<>();
        boolean inserisci = true;
        while(inserisci) {
            double id = esercizioScriviContenutiClasseLeggi.inserisciId();
            String nome = esercizioScriviContenutiClasseLeggi.inserisciNome();
            int prezzo = esercizioScriviContenutiClasseLeggi.inserisciPrezzo();
            prodotti.put(nome,new Product(id,nome,prezzo));
            System.out.println("Vuoi inserire un altro prodotto? (si/no)");
            Scanner scanner = new Scanner(System.in);
            String continuare = scanner.nextLine();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("prodotti.txt"));
            bufferedWriter.write("Pododotto: "+id+" "+nome+ " "+ prezzo+"\n");
            bufferedWriter.close();
            switch (continuare) {
                case "si":
                    inserisci=true;
                    break;
                case "no":
                    inserisci=false;
                    break;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader("prodotti.txt"));
            String fraseLetta = bufferedReader.readLine();
            System.out.println("Il file contiene-> "+fraseLetta);



    }}
    private double inserisciId(){
        boolean valoreCorretto=false;
        String valore="";
        while (!valoreCorretto){

            System.out.println("Inserici il valore dell'id del prodotto (deve contenere solo valori numerici)");
            Scanner scanner1 = new Scanner(System.in);

                valore =scanner1.nextLine();

            valoreCorretto = valore.matches("[0-9]+");
            scanner1.close();
            if (!valoreCorretto){
                System.out.println("Il valore non contiene solo numeri!");
            }

        }

        return  Double.parseDouble(valore);}
    private String inserisciNome(){
        boolean valoreCorretto=false;
        String valore="";
        Scanner scanner1 = new Scanner(System.in);
        while (!valoreCorretto){

            System.out.print("Inserici il nome del prodotto (puo' contenere solo lettere e numeri)");
            scanner1.next();
            while(scanner1.hasNextLine()){
                valore =scanner1.nextLine();
                // Switch condition here
            }
            valore =scanner1.nextLine();


            valoreCorretto = valore.matches("[a-zA-Z0-9]+");
            scanner1.close();
            if (!valoreCorretto){
                System.out.println("Il valore non contiene solo lettere e numeri!");
            }

        }

        return  valore;}
    private int inserisciPrezzo(){
        boolean valoreCorretto=false;
        String valore="";
        while (!valoreCorretto){

            System.out.println("Inserici il prezzi del prodotto (deve contenere solo valori numerici)");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext()){
                valore = scanner.nextLine();}
            else {valore = scanner.nextLine();}
            valoreCorretto = valore.matches("[0-9]+");
            scanner.close();
            if (!valoreCorretto){
                System.out.println("Il valore non contiene solo numeri!");
            }

        }
        return  Integer.parseInt(valore);}
    }



