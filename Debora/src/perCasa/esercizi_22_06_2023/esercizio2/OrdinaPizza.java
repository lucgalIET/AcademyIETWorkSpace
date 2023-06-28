package perCasa.esercizi_22_06_2023.esercizio2;

import java.util.Scanner;

public class OrdinaPizza {

    public OrdinaPizza(){}

    public void ordinaPizzaMargherita(){
        PizzaMargheritaCreator pizzaMargheritaCreator = new PizzaMargheritaCreator();
        Pizza pizzaMargherita = pizzaMargheritaCreator.creaPizza();
        System.out.println("Ecco la tua pizza: ");
        System.out.println(pizzaMargherita.getNome());
        System.out.println("lista ingredienti: "+pizzaMargherita.getListaIngredienti());
        System.out.println("prezzo: "+pizzaMargherita.prezzo());
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------------------------\n");
        System.out.println("Vuoi aggiungere altri ingredienti alla tua pizza? (si:no) ");
        String scelta = in.nextLine();
        while(!scelta.equalsIgnoreCase("no")){
            System.out.println("Puoi scegliere di aggiungere tra questi ingredienti: ");
            System.out.println(pizzaMargherita.getListaIngredientiDaScegliere());
            System.out.println("Scegli un'ingrediente: ");
            scelta = in.nextLine();
            pizzaMargherita.aggiungiIngrediente(Ingrediente.valueOf(scelta.toUpperCase()));
            System.out.println("---------------------------------------------\n");
            System.out.println("Vuoi aggiungere altri ingredienti alla tua pizza? (si:no) ");
            scelta = in.nextLine();
        }
        System.out.println("---------------------------------------------\n");
        System.out.println("La tua pizza presto sara pronta!");

    }

    public void ordinaPizzaDiavola(){
        PizzaDiavolaCreator pizzaDiavolaCreator = new PizzaDiavolaCreator();
        Pizza pizzaDiavola = pizzaDiavolaCreator.creaPizza();
        System.out.println("Ecco la tua pizza: ");
        System.out.println(pizzaDiavola.getNome());
        System.out.println("lista ingredienti: "+pizzaDiavola.getListaIngredienti());
        System.out.println("prezzo: "+pizzaDiavola.prezzo());
        Scanner in = new Scanner(System.in);
        System.out.println("Vuoi aggiungere altri ingredienti alla tua pizza? (si:no) ");
        String scelta = in.nextLine();
        System.out.println("---------------------------------------------\n");
        while(!scelta.equalsIgnoreCase("no")){
            System.out.println("Puoi scegliere di aggiungere tra questi ingredienti: ");
            System.out.println(pizzaDiavola.getListaIngredientiDaScegliere());
            System.out.println("Scegli un'ingrediente: ");
            scelta = in.nextLine();
            pizzaDiavola.aggiungiIngrediente(Ingrediente.valueOf(scelta.toUpperCase()));
            System.out.println("---------------------------------------------\n");
            System.out.println("Vuoi aggiungere altri ingredienti alla tua pizza? (si:no) ");
            scelta = in.nextLine();
        }
        System.out.println("---------------------------------------------\n");
        System.out.println("La tua pizza presto sara pronta!");
    }

    public void ordinaPizzaTonnoCipolla(){
        PizzaTonnoCipollaCreator pizzaTonnoCipollaCreator = new PizzaTonnoCipollaCreator();
        Pizza pizzaTonnoCipolla = pizzaTonnoCipollaCreator.creaPizza();
        System.out.println("Ecco la tua pizza: ");
        System.out.println(pizzaTonnoCipolla.getNome());
        System.out.println("lista ingredienti: "+pizzaTonnoCipolla.getListaIngredienti());
        System.out.println("prezzo: "+pizzaTonnoCipolla.prezzo());
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------------------------\n");
        System.out.println("Vuoi aggiungere altri ingredienti alla tua pizza? (si:no) ");
        String scelta = in.nextLine();
        while(!scelta.equalsIgnoreCase("no")){
            System.out.println("Puoi scegliere di aggiungere tra questi ingredienti: ");
            System.out.println(pizzaTonnoCipolla.getListaIngredientiDaScegliere());
            System.out.println("Scegli un'ingrediente: ");
            scelta = in.nextLine();
            pizzaTonnoCipolla.aggiungiIngrediente(Ingrediente.valueOf(scelta.toUpperCase()));
            System.out.println("---------------------------------------------\n");
            System.out.println("Vuoi aggiungere altri ingredienti alla tua pizza? (si:no) ");
            scelta = in.nextLine();
        }
        System.out.println("---------------------------------------------\n");
        System.out.println("La tua pizza presto sara pronta!");
    }

    public void ordinaPrimavera(){
        PizzaPrimaveraCreator pizzaPrimaveraCreator = new PizzaPrimaveraCreator();
        Pizza pizzaPrimavera = pizzaPrimaveraCreator.creaPizza();
        System.out.println("Ecco la tua pizza: ");
        System.out.println(pizzaPrimavera.getNome());
        System.out.println("lista ingredienti: "+pizzaPrimavera.getListaIngredienti());
        System.out.println("prezzo: "+pizzaPrimavera.prezzo());
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------------------------\n");
        System.out.println("Vuoi aggiungere altri ingredienti alla tua pizza? (si:no) ");
        String scelta = in.nextLine();
        while(!scelta.equalsIgnoreCase("no")){
            System.out.println("Puoi scegliere di aggiungere tra questi ingredienti: ");
            System.out.println(pizzaPrimavera.getListaIngredientiDaScegliere());
            System.out.println("Scegli un'ingrediente: ");
            scelta = in.nextLine();
            pizzaPrimavera.aggiungiIngrediente(Ingrediente.valueOf(scelta.toUpperCase()));
            System.out.println("---------------------------------------------\n");
            System.out.println("Vuoi aggiungere altri ingredienti alla tua pizza? (si:no) ");
            scelta = in.nextLine();
        }
        System.out.println("---------------------------------------------\n");
        System.out.println("La tua pizza presto sara pronta!");
    }
}
