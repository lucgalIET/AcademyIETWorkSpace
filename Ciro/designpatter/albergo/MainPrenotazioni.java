package Ciro.designpatter.albergo;

import java.util.Scanner;

public class MainPrenotazioni {

    public static void main(String[] args) {
        Prenotazione prenotazione = new Prenotazione();

        Scanner input = new Scanner(System.in);

        String scelta = "";

        while(true){
            System.out.println("Effettua prenotazione");
            System.out.println("1) camera singola ");
            System.out.println("2) camera doppia ");
            System.out.println("3) suite");
            System.out.println("4) esci");
            System.out.print("scelta ");
            scelta = input.nextLine();

            switch (scelta){
                case "1":{
                    prenotazione.prenotaCameraSingola();
                    break;
                }
                case "2": {
                    prenotazione.prenotaCameraDoppia();
                    break;
                }
                case "3":{
                    prenotazione.prenotaSuite();
                    break;
                }
                default:
                    System.out.println("Arrivederci!!!");
                    return;
            }
        }


    }
}
