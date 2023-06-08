package eserciziacasa.esercizifile.product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Inserisci ID, Nome e Prezzo: ");
        Product p1 = new Product(myScan.nextInt(), myScan.next(), myScan.nextDouble());
        System.out.println("Inserisci ID, Nome e Prezzo: ");
        Product p2 = new Product(myScan.nextInt(), myScan.next(), myScan.nextDouble());
        System.out.println("Inserisci ID, Nome e Prezzo: ");
        Product p3 = new Product(myScan.nextInt(), myScan.next(), myScan.nextDouble());
        myScan.close();
        List<Product> productList = Arrays.asList(p1,p2,p3);

        BufferedWriter writer = new BufferedWriter(new FileWriter("eserciziacasa/esercizifile/product/text.txt"));
        Function<Product, String> function = (p) -> {
            String s = "Id: "+p.getId();
            s += " | Nome: "+p.getName();
            s += " | Prezzo: "+p.getPrice()+"\n";
            return s;
        };
        productList.stream().map(function).forEach(x -> {
            try {
                writer.write(x);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("eserciziacasa/esercizifile/product/text.txt"));
        String s = reader.readLine();
        while(s != null){
            System.out.println(s);
            s = reader.readLine();
        }

    }
}
