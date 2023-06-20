package designpattern.factorymethod;

import java.util.Scanner;

/*Esercizio su Factory Method:
 Sviluppare un'applicazione di logistica che gestisce la consegna di pacchi.
 Implementa un Factory Method per la creazione di oggetti "Consegna" in base al tipo di pacchetto da consegnare, come "Standard" e "Express".
  Ciascun tipo di consegna avrà le proprie regole e processi specifici.
  Utilizza il Factory Method per creare istanze di consegne in base al tipo selezionato.*/
public class FactoryMethodMain {

    public static void main(String[] args) {
        Scanner mioScanner=new Scanner(System.in);
        System.out.println("Seleziona il metodo ci consegna del pacco: a-> Consegna Express, b-> Consegna Standard");
        String scelta=mioScanner.nextLine();
        if(scelta.equals("a")) {
            ConsegnaCreator consegnaExpressCreator = new ConsegnaExpressCreator();
            consegnaExpressCreator.gestioneConsegne();
        }else if(scelta.equals("b")) {
            ConsegnaCreator consegnaStandardCreator = new ConsegnaStandardCreator();
            consegnaStandardCreator.gestioneConsegne();
        }
    }
}