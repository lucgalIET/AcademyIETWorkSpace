package perCasa.esercizi_22_06_2023.esercizio2;

import java.util.Scanner;

public class MainPizzeria {

    public static void main(String[] args) {
        OrdinaPizza ordinaPizza = new OrdinaPizza();
        Scanner in = new Scanner(System.in);
        System.out.println("Che pizza vuoi ordinare? (margherita, diavola, primavera, tonno): ");
        String scelta = in.nextLine();
        switch(scelta.toLowerCase()){
            case "margherita":
                ordinaPizza.ordinaPizzaMargherita();
                break;
            case "diavola":
                ordinaPizza.ordinaPizzaDiavola();
                break;
            case "primavera":
                ordinaPizza.ordinaPrimavera();
                break;
            case "tonno":
                ordinaPizza.ordinaPizzaTonnoCipolla();
                break;
        }
    }
}
