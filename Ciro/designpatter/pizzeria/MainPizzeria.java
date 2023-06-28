package Ciro.designpatter.pizzeria;

import java.util.Scanner;

public class MainPizzeria {

    public static void main(String[] args) {
        OrdinaPizza ordinaPizza = new OrdinaPizza();
        Scanner input = new Scanner(System.in);
        String scelta = "";

        while(true) {
            System.out.print("Che pizza vuoi ordinare? (margherita, diavola, primavera, napoletana (altro per uscire): ");
            scelta = input.nextLine();

            switch (scelta.toLowerCase()) {
                case "margherita":
                    ordinaPizza.ordinaPizzaMargherita();
                    break;
                case "diavola":
                    ordinaPizza.ordinaPizzaDiavola();
                    break;
                case "primavera":
                    ordinaPizza.ordinaPrimavera();
                    break;
                case "napoletana":
                    ordinaPizza.ordinaPizzaNapoletana();
                    break;
                default: {
                    System.out.println("arrivederci a presto !!!");
                    return;
                }
            }
        }
    }
}
