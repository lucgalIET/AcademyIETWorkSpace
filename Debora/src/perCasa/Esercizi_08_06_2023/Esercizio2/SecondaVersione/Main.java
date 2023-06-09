package perCasa.Esercizi_08_06_2023.Esercizio2.SecondaVersione;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> mapProducts = new HashMap<>();
        Scanner nameScan = new Scanner(System.in);
        Scanner priceScan = new Scanner(System.in);
        int count = 0;
        String name = "";
        double price = 0.0;

        do{
            System.out.println("Inserire un prodotto!");
            System.out.println("Inserire il nome del prodotto:");
            name = nameScan.nextLine();
            System.out.println("Inserire il prezzo del prodotto:");
            price = priceScan.nextDouble();
            System.out.println("-------------------------------------\n");
            Product product = new Product(name, price);
            mapProducts.put(product.getName(), product.getPrice());
            count++;
        }while(!(count == 3));

        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("prodotti1.txt"));
            for(Map.Entry<String, Double> entry: mapProducts.entrySet()){
                bufferedWriter.write(entry.getKey()+ ", "+ entry.getValue()+"\n");
            }

            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("prodotti1.txt"));
            String row = bufferedReader.readLine();
            while(row != null){
                System.out.println(row);
                row = bufferedReader.readLine();
            }

        }catch (IOException e){
            throw new RuntimeException();
        }

    }
}
