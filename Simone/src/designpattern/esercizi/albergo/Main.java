package designpattern.esercizi.albergo;

import java.util.Scanner;

/*
Sviluppare un'applicazione per la creazione di un sistema di prenotazione di camere d'albergo.
Il sistema deve gestire diverse tipologie di camere come singole, doppie e suite, ognuna con caratteristiche specifiche come il numero di letti, la vista,
i servizi inclusi, ecc.

 */
public class Main {
    public static void main(String[] args) {
        Scanner mioScanner=new Scanner(System.in);
        System.out.println("Scegli una camera: a-> Singola b-> Doppia c-> Suite");
        String scelta= mioScanner.next();
        if(scelta.equals("a")) {
            CameraCreator singolaCreator= new SingolaCreator(1,"Montagne","nessuno");
            singolaCreator.assegnaCamera();
        }else if(scelta.equals("b")) {
            CameraCreator doppiaCreator = new DoppiaCreator(2,"pianura","Colazione, Pranzo");
            doppiaCreator.assegnaCamera();
        }else if(scelta.equals("c")) {
            CameraCreator suiteCreator = new SuiteCreator(6,"Mare","Tutti i servizi dell'Albergo");
            suiteCreator.assegnaCamera();
        }

    }
}
