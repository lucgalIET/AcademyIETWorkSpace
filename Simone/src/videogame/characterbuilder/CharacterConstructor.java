package videogame.characterbuilder;

import java.util.Scanner;

public class CharacterConstructor implements CharacterBuilder{
    private Character character;
    Scanner mioScanner=new Scanner(System.in);
    public CharacterConstructor() {
        character = new Character();
    }
    @Override
    public void name() {
        System.out.println("Inserisci il nome del tuo personaggio");
        String name= mioScanner.next();
        character.setName(name);
    }

    @Override
    public void race() {
        System.out.println("Seleziona la razza:\n1-> Umano\n2-> Elfo\n3-> Orco");
        int select= mioScanner.nextInt();
        switch (select) {
            case 1:
                character.setRace("Umano");
                break;
            case 2:
                character.setRace("Elfo");
                break;
            case 3:
                character.setRace("Orco");
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public void type() {
        System.out.println("Seleziona il tipo:\n1-> Titano\n2-> Mago\n3-> Demone");
        int select= mioScanner.nextInt();
        switch (select) {
            case 1:
                character.setType("Titano");
                break;
            case 2:
                character.setType("Mago");
                break;
            case 3:
                character.setType("Demone");
                break;
            default:
                throw new IllegalArgumentException();
        }

    }
    @Override
    public void appereance() {
        System.out.println("Opzionale: seleziona gli elementi per l'aspetto fisico, premere 0 una volta finito");
        System.out.println("1-> Tatuaggio facciale\n2-> Tatuaggio braccio sinistro\n3-> Tatuaggio braccio destro\n4-> Cicatrici sul corpo");
        int select=0;
        do{
            select= mioScanner.nextInt();
            switch (select){
                case 1:
                    character.addAppereance("Tatuaggio facciale");
                    break;
                case 2:
                    character.addAppereance("Tatuaggio braccio sinistro");
                    break;
                case 3:
                    character.addAppereance("Tatuaggio braccio destro");
                    break;
                case 4:
                    character.addAppereance("Cicatrici sul corpo");
                    break;
                default:
                    System.out.println("Personalizzazione finita!");
            }
        }while(select!=0);

    }
    @Override
    public void equipment() {
        System.out.println("Seleziona l'equipaggiamento del personaggio");
        System.out.println("Scegli l'arma principale");
        System.out.println("1-> Spada\n2-> Lancia \n3-> Ascia \n4-> Martello");
        int select1;
        int select2;
        select1 = mioScanner.nextInt();
        switch (select1) {
            case 1:
                character.addEquipment("Spada");
                break;
            case 2:
                character.addEquipment("Lancia");
                break;
            case 3:
                character.addEquipment("Ascia");
                break;
            case 4:
                character.addEquipment("Martello");
                break;
            default:
                throw new IllegalArgumentException();

        }
        System.out.println("Scegli l'arma secondaria");
        System.out.println("1-> Arco\n2-> Scudo piccolo\n3-> Scudo grande \n4-> Balestra ");
        select2= mioScanner.nextInt();
        switch (select2) {
            case 1:
                character.addEquipment("Arco");
                break;
            case 2:
                character.addEquipment("Scudo piccolo");
                break;
            case 3:
                character.addEquipment("Scudo grande");
                break;
            case 4:
                character.addEquipment("Balestra");
                break;
            default:
                throw new IllegalArgumentException();

        }
    }



    @Override
    public void abilities() {
        System.out.println("Inserire due abilità speciali del personaggio: ");
        System.out.println("1-> Forza bruta\n2-> Scatto fulmineo\n3-> Invisibilità\n4-> Resuscitare i morti");
        for(int i=0;i<2;i++) {
            int select = mioScanner.nextInt();
            switch (select) {
                case 1:
                    character.addAbilities("Forza bruta");
                    break;
                case 2:
                    character.addAbilities("Scatto fulmineo");
                    break;
                case 3:
                    character.addAbilities("Invisibilità");
                    break;
                case 4:
                    character.addAbilities("Resuscitare i morti");
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    @Override
    public Character getCharacter() {
        return character;
    }
}
