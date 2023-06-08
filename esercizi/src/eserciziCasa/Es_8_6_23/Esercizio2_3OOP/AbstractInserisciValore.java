package esercizi.src.eserciziCasa.Es_8_6_23.Esercizio2_3OOP;

import java.util.Scanner;

public abstract class AbstractInserisciValore implements Print{
    public static int inserisciValoreNumerico(){
        boolean valoreCorretto=false;
        String valore="";
        while (!valoreCorretto){

//            System.out.println("Inserici l'ISBN del prodotto (deve contenere solo valori numerici)");
            Scanner scanner = new Scanner(System.in);
            valore = scanner.nextLine();
            valoreCorretto = valore.matches("[0-9]+");
            scanner.close();
            if (!valoreCorretto){
                System.out.println("Il valore non contiene solo numeri!");
            }

        }

        return  Integer.parseInt(valore);}
    public static String inserisciStringa(){
        boolean valoreCorretto=false;
        String valore="";
        while (!valoreCorretto){

//            System.out.println("Inserici il nome del prodotto (puo' contenere solo lettere e numeri)");
            Scanner scanner = new Scanner(System.in);
            valore = scanner.nextLine();
            valoreCorretto = valore.matches("[a-zA-Z0-9]+");
            scanner.close();
            if (!valoreCorretto){
                System.out.println("Il valore non contiene solo lettere e numeri!");
            }

        }

        return  valore;}
    public static double inserisciDouble(){
        boolean valoreCorretto=false;
        String valore="";
        while (!valoreCorretto){

//            System.out.println("Inserici l'autore del libro (deve contenere solo lettere)");
            Scanner scanner = new Scanner(System.in);
            valore = scanner.nextLine();
            valoreCorretto = valore.matches("[a-zA-Z]+");
            scanner.close();
            if (!valoreCorretto){
                System.out.println("Il valore non contiene solo numeri!");
            }

        }
        return  Double.parseDouble(valore);}
}

