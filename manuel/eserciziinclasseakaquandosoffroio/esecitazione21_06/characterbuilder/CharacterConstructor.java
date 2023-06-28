package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder;

import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder.Character;
import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder.CharacterBuilder;
import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.creator.MeleeWeaponCreator;
import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.creator.RangedWeaponCreator;
import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.creator.Weapon;
import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.creator.WeaponCreator;

import java.util.Scanner;

public class CharacterConstructor implements CharacterBuilder {
    private Character character;
    Scanner myScan;

    public CharacterConstructor() {
        character = new Character();
        myScan = new Scanner(System.in);
    }

    @Override
    public void name() {
        String select;
        System.out.println("Select your name: ");
        select = myScan.next();
        character.setName(select);
    }


    @Override
    public void race() {
        String select;
        System.out.println("Select 1 for Human or 2 for Elf: ");
        select = myScan.next();
        switch(select){
            case "1":{
                character.setRace("Human");
            } break;
            case "2":{
                character.setRace("Elf");
            }break;
            default: throw new IllegalArgumentException();
        }
    }

    @Override
    public void type() {
        String select;
        System.out.println("Select 1 for Barbarian or 2 for Bard: ");
        select = myScan.next();
        switch(select){
            case "1":{
                character.setType("Barbarian");
            } break;
            case "2":{
                character.setType("Bard");
            }break;
            default: throw new IllegalArgumentException();
        }
    }

    @Override
    public void equipment() {
        String select;
        System.out.println("Select 1 for melee weapon or 2 for ranged weapon: ");
        select = myScan.next();
        switch (select){
            case "1":{
                WeaponCreator weaponCreator = new MeleeWeaponCreator();
                Weapon sword = weaponCreator.forgeWeapon();
                character.addEquipment(sword);
            } break;
            case "2":{
                WeaponCreator weaponCreator = new RangedWeaponCreator();
                Weapon bow = weaponCreator.forgeWeapon();
                character.addEquipment(bow);
            } break;
            default: throw new IllegalArgumentException();
        }
    }

    @Override
    public void appereance() {
        String select;
        System.out.println("Insert your changes");
        select = myScan.next();
        character.addAppereance(select);
        System.out.println("Now you look handsome!!");
    }

    @Override
    public void abilities() {
        String select;
        System.out.println("Insert your new ability");
        select = myScan.next();
        character.addAbilities(select);
    }

    @Override
    public Character getCharacter() {
        return character;
    }


}
