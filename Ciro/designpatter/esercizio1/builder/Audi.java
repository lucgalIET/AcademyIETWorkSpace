package Ciro.designpatter.esercizio1.builder;

import java.util.Scanner;

public class Audi implements AutomobileBuilder {
    Scanner mioScanner=new Scanner(System.in);

    private Automobile automobile;

    public Audi() {
        this.automobile = new Automobile();


    }

    @Override
    public void motoreAutomobile() {
        System.out.println("Seleziona i CV del motore: a-> 110 CV, b-> 125 CV, c-> 200 CV");
        String scelta=mioScanner.nextLine();
        if(scelta.equals("a")){
            automobile.setMotore("110 CV");
        }else if(scelta.equals("b")){
            automobile.setMotore("125 CV");
        }else if(scelta.equals("c")){
            automobile.setMotore("200 CV");
        }

    }

    @Override
    public void carrozzeriaAutomobile() {
        System.out.println("Seleziona la carrozzeria: a-> Carbonio, b-> Alluminio");
        String scelta = mioScanner.nextLine();
        if (scelta.equals("a")) {
            automobile.setCarrozzeria("Carbonio");
        } else if (scelta.equals("b")) {
            automobile.setCarrozzeria("Alluminio");

        }
    }

    @Override
    public void interniAutomobile() {
        System.out.println("Seleziona gli interni: a-> Pelle, b-> Tessuto");
        String scelta = mioScanner.nextLine();
        if (scelta.equals("a")) {
            automobile.setInterni("Pelle");
        } else if (scelta.equals("b")) {
            automobile.setInterni("Tessuto");

        }
    }



    @Override
    public Automobile getAutomobile() {
        return automobile;
    }
}