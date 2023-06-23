package designpattern.esercizi.pizzeria;

import java.util.Scanner;
/*
Sviluppare un'applicazione per una pizzeria che permette agli utenti di ordinare diverse tipologie di pizze come margherita, diavola, quattro formaggi, ecc.
Utilizza un D. pattern  per implementare un metodo che crea oggetti di tipo Pizza in base al tipo richiesto dall'utente.
 */
public class PizzeriaMain {
    public static void main(String[] args) {
        Scanner mioScanner=new Scanner(System.in);
        System.out.println("Scegli una pizza da ordinare: a-> Margherita b-> Diavola c-> Quattro Formaggi");
        String scelta= mioScanner.next();
        if(scelta.equals("a")) {
            PizzaCreator pizzaCreatorMargherita = new MargheritaCreator();
            pizzaCreatorMargherita.preparaPizza();
        }else if(scelta.equals("b")) {
            PizzaCreator pizzaCreatorDiavola = new DiavolaCreator();
            pizzaCreatorDiavola.preparaPizza();
        }else if(scelta.equals("c")) {
            PizzaCreator pizzaCreatorQuattroFormaggi = new QuattroFormaggiCreator();
            pizzaCreatorQuattroFormaggi.preparaPizza();
        }
    }
}
