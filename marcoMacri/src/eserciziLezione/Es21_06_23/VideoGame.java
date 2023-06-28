package marcoMacri.src.eserciziLezione.Es21_06_23;

import marcoMacri.src.eserciziLezione.Es21_06_23.classe.Guerrior;
import marcoMacri.src.eserciziLezione.Es21_06_23.classe.Mago;
import marcoMacri.src.eserciziLezione.Es21_06_23.classe.Thief;
import marcoMacri.src.eserciziLezione.Es21_06_23.race.Elf;
import marcoMacri.src.eserciziLezione.Es21_06_23.race.Human;
import marcoMacri.src.eserciziLezione.Es21_06_23.race.Ogre;
import marcoMacri.src.eserciziLezione.Es21_06_23.race.Race;

import java.util.Calendar;
import java.util.Scanner;

//Esercizio 1:
//
//        Testo dell'esercizio:
//        Sviluppare un'applicazione per la creazione di un videogioco in cui i giocatori possono creare
//        il proprio personaggio scegliendo tra diverse razze (umani, elfi, orchi, ecc.) e classi (guerrieri, maghi, ladri, ecc.).
//        Inoltre, i giocatori possono personalizzare il personaggio selezionando attributi come l'aspetto fisico, l'equipaggiamento e le abilità speciali.
public class VideoGame {
    public static void main(String[] args) {
        Character character = new Character();
        Scanner sc = new Scanner(System.in);
        System.out.println("Scegli la razza del tuo personaggio scrivendo il nome in minuscolo potendo scegliere tra: elfo, orco, umano");
        String race = sc.nextLine();
        switch (race) {
            case "elfo" -> character.setRace(new Elf());
            case "orco" -> character.setRace(new Ogre());
            case "umano" -> character.setRace(new Human());
        }
        System.out.println("Scegli la classe del tuo personaggio scrivendo il nome in minuscolo potendo scegliere tra: guerriero, mago, ladro");
            String classe = sc.nextLine();
        switch (classe) {
            case "guerriero" -> character.setClasse(new Guerrior());
            case "mago" -> character.setClasse(new Mago());
            case "ladro" -> character.setClasse(new Thief());
        }

            System.out.println("Scegli l'aspetto fisico del tuo personaggio scrivendo il nome in minuscolo potendo scegliere tra: alto, basso, medio");
            String aspettoFisico = sc.nextLine();
        switch (aspettoFisico) {
            case "alto" -> character.setPhisicalAspect("alto");
            case "basso" -> character.setPhisicalAspect("basso");
            case "medio" -> character.setPhisicalAspect("medio");
        }
        System.out.println("Scegli l'equipaggiamento del tuo personaggio scrivendo l'aggettivo in minuscolo potendo scegliere tra: magia, armi, forzaBruta");
        String equipaggiamento = sc.nextLine();
        switch (equipaggiamento) {
            case "magia" -> character.setEquipment("magia");
            case "basso" -> character.setEquipment("armi");
            case "forzaBruta" -> character.setEquipment("forzaBruta");
        }
        System.out.println("Scegli le abilita speciali del tuo personaggio scrivendo l'aggettivo in minuscolo potendo scegliere tra: colpoSpeciale1, colpoSpeciale2, colpoSpeciale3");
        String skills = sc.nextLine();
        switch (skills) {
            case "colpoSpeciale1" -> character.setSpecialSkills("colpoSpeciale1");
            case "basso" -> character.setSpecialSkills("colpoSpeciale2");
            case "forzaBruta" -> character.setSpecialSkills("colpoSpeciale3");
        }
    }}

