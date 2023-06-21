package inClasse.esercizio_21_06_2023;

import java.util.Scanner;

public class MainCharacter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire il nome: ");
        String nome = in.nextLine();
        Choices.setName(nome);
        System.out.println("Inserire la razza (human, elven, ogre): ");
        nome = in.nextLine();
        switch (nome) {
            case "human" -> Choices.setRace(new Human(nome));
            case "elven" -> Choices.setRace(new Elven(nome));
            case "ogre" -> Choices.setRace(new Ogre(nome));
        }

        System.out.println("Inserire il tipo (warrior, wizard, thief): ");
        nome = in.nextLine();
        switch (nome) {
            case "warrior" -> Choices.setType(new Warrior(nome));
            case "wizard" -> Choices.setType(new Wizard(nome));
            case "thief" -> Choices.setType(new Thief(nome));
        }
        System.out.println("Inserire l'aspetto fisico: ");
        nome = in.nextLine();
        Choices.setAppereance(nome);
        System.out.println("Inserire l'equipaggiamento: ");
        nome = in.nextLine();
        Choices.setEquip(nome);
        System.out.println("Inserire le abilità: ");
        nome = in.nextLine();
        Choices.setAbilities(nome);

        CharacterBuilder characterBuilder = new Character();
        CharacterDirector characterDirector = new CharacterDirector(characterBuilder);

        Character character = characterDirector.characterBuilder();
        System.out.println(character);


    }
}
