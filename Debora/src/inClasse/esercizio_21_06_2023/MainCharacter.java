package inClasse.esercizio_21_06_2023;

import java.util.Scanner;

public class MainCharacter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire il nome: ");
        String nome = in.nextLine();
        Chooses.setName(nome);
        System.out.println("Inserire la razza (human, elven, ogre): ");
        nome = in.nextLine();
        switch (nome) {
            case "human" -> Chooses.setRace(new Human(nome));
            case "elven" -> Chooses.setRace(new Elven(nome));
            case "ogre" -> Chooses.setRace(new Ogre(nome));
        }

        System.out.println("Inserire il tipo (warrior, wizard, thief): ");
        nome = in.nextLine();
        switch (nome) {
            case "warrior" -> Chooses.setType(new Warrior(nome));
            case "wizard" -> Chooses.setType(new Wizard(nome));
            case "thief" -> Chooses.setType(new Thief(nome));
        }
        System.out.println("Inserire l'aspetto fisico: ");
        nome = in.nextLine();
        Chooses.setAppereance(nome);
        System.out.println("Inserire l'equipaggiamento: ");
        nome = in.nextLine();
        Chooses.setEquip(nome);
        System.out.println("Inserire le abilità: ");
        nome = in.nextLine();
        Chooses.setAbilities(nome);

        CharacterBuilder characterBuilder = new Character();
        CharacterDirector characterDirector = new CharacterDirector(characterBuilder);

        Character character = characterDirector.characterBuilder();
        System.out.println(character);


    }
}
