package Ciro.esercizi_flussi_file.eserciio2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBonus {
    public static void main(String[] args) {

        Map<Integer, Product> mappaProdotti = new HashMap<>();

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Inserisci prodotto ");
            System.out.print("identificativo : ");
            Integer id = input.nextInt();
            input.nextLine();
            System.out.print("nome : ");
            String name = input.nextLine();
            System.out.print("prezzo : ");
            Double price = input.nextDouble();
            input.nextLine();
            Product prodotto = new Product(id, name, price);
            mappaProdotti.put(id, prodotto);
        }
        System.out.println("Visualizzazione della mappa di prodotti");
        for (Map.Entry<Integer, Product> mappa: mappaProdotti.entrySet()) {
            System.out.print(mappa.getKey() + " ");
            System.out.print(mappa.getValue().getName() + " ");
            System.out.println(mappa.getValue().getPrice());
        }

        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Ciro/esercizi_flussi_file/eserciio2/productBonus.txt"));
            for (Map.Entry<Integer, Product> mappa: mappaProdotti.entrySet()){
               Integer id = mappa.getKey();
               bufferedWriter.write(id + " ");
               String n = mappa.getValue().getName();
               bufferedWriter.write(n + " ");
               Double p = mappa.getValue().getPrice();
               bufferedWriter.write(p.toString() + "\n");

            }
            bufferedWriter.close();
            input.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("Ciro/esercizi_flussi_file/eserciio2/productBonus.txt"));
            String prod = bufferedReader.readLine();
            System.out.println("-------------------------------");
            System.out.println("Visualizzazione prodotti presenti sul file");
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
