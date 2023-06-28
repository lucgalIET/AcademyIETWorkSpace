package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.melee;

import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.creator.Weapon;

import java.util.Scanner;

public class MeleeWeapon implements Weapon {
    private String name;

    public MeleeWeapon(){
        System.out.print("Insert the name of your new sword: ");
        Scanner myScan = new Scanner(System.in);
        name = myScan.nextLine();
    }
    @Override
    public int attack() {
        return 10;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: "+name);
        return sb.toString();
    }
}
