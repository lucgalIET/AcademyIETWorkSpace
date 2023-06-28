package Ciro.designpatter.pizzeria;

import java.util.Scanner;

public class OrdinaPizza {

    public OrdinaPizza(){}

    public void ordinaPizzaMargherita(){
        PizzaMargheritaCreator pizzaMargheritaCreator = new PizzaMargheritaCreator();
        Pizza pizzaMargherita = pizzaMargheritaCreator.creaPizza();
        System.out.println("---------------------------------------------");
        System.out.print("Ecco la tua pizza: ");
        System.out.println(pizzaMargherita.getNome());
        System.out.println("ingredienti " + pizzaMargherita.mostraIngredienti());
        System.out.println("prezzo " + pizzaMargherita.getPrezzo());
        System.out.println("---------------------------------------------");

    }

    public void ordinaPizzaDiavola(){
        PizzaDiavolaCreator pizzaDiavolaCreator = new PizzaDiavolaCreator();
        Pizza pizzaDiavola = pizzaDiavolaCreator.creaPizza();
        System.out.println("---------------------------------------------");
        System.out.print("Ecco la tua pizza: ");
        System.out.println(pizzaDiavola.getNome());
        System.out.println("ingredienti " + pizzaDiavola.mostraIngredienti());
        System.out.println("prezzo " + pizzaDiavola.getPrezzo());
        System.out.println("---------------------------------------------");

    }

    public void ordinaPizzaNapoletana(){
        PizzaNapoletanaCreator pizzaNapoletanaCreator = new PizzaNapoletanaCreator();
        Pizza pizzaNapoletana = pizzaNapoletanaCreator.creaPizza();
        System.out.println("---------------------------------------------");
        System.out.print("Ecco la tua pizza: ");
        System.out.println(pizzaNapoletana.getNome());
        System.out.println("ingredienti " + pizzaNapoletana.mostraIngredienti());
        System.out.println("prezzo " + pizzaNapoletana.getPrezzo());
        System.out.println("---------------------------------------------");

    }

    public void ordinaPrimavera(){
        PizzaPrimaveraCreator pizzaPrimaveraCreator = new PizzaPrimaveraCreator();
        Pizza pizzaPrimavera = pizzaPrimaveraCreator.creaPizza();
        System.out.println("---------------------------------------------");
        System.out.print("Ecco la tua pizza: ");
        System.out.println(pizzaPrimavera.getNome());
        System.out.println("ingredienti " + pizzaPrimavera.mostraIngredienti());
        System.out.println("prezzo " + pizzaPrimavera.getPrezzo());
        System.out.println("---------------------------------------------");

    }
}
