package Ciro.esercizi_flussi_file.eserciio2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/*
Scrivi un programma Java che crea una classe Product con i campi id (identificatore), name e price.
Il programma chiede all'utente di inserire i dati di tre prodotti e li salva in una lista di oggetti Product.
Successivamente, scrivi i dati della lista su un file di testo e leggi il file per visualizzare i prodotti sullo schermo.
bonus:utilizzo di map

 */
public class Main {

    public static void main(String[] args) {

        List<Product> listaProdotti = new LinkedList<>();

//        Scanner input = new Scanner(System.in);
//
//        for(int i = 1; i <= 3; i++) {
//            System.out.println("Inserisci prodotto ");
//            System.out.print("identificativo : ");
//            Integer id = input.nextInt();
//            input.nextLine();
//            System.out.print("nome : ");
//            String name = input.nextLine();
//            System.out.print("prezzo : ");
//            Double price = input.nextDouble();
//            input.nextLine();
//            Product prodotto = new Product(id, name, price);
//            listaProdotti.add(prodotto);
//        }
//        System.out.println("Visualizzazione della lista di prodotti");
//        for(Product p : listaProdotti){
//            System.out.println(p);
//        }
        try{
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("eserciziPerCasa/esercizi_flussi_file/eserciio2/product.txt"));
//            for(Product p : listaProdotti){
//                bufferedWriter.write(p.getId() + " ");
//                bufferedWriter.write(p.getName() + " ");
//                bufferedWriter.write(p.getPrice() + "\n");
//            }
//
//            bufferedWriter.close();
//            input.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("Ciro/esercizi_flussi_file/eserciio2/product.txt"));
            String prod = bufferedReader.readLine();

            System.out.println("visualizzazione prodotti presenti sul file");
            while (prod!=null){
                System.out.println(prod);
                prod = bufferedReader.readLine();
            }

            bufferedReader.close();

        }catch(IOException e){
            throw new RuntimeException();
        }

    }
}
