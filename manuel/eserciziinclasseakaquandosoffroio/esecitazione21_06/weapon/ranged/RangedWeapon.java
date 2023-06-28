package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.ranged;

import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.creator.Weapon;

import java.util.Scanner;

public class RangedWeapon implements Weapon {
    private String name;

    public RangedWeapon(){
        System.out.print("Insert the name of your new bow: ");
        Scanner myScan = new Scanner(System.in);
        name = myScan.nextLine();
    }
    @Override
    public int attack() {
        return 8;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: "+name);
        return sb.toString();
    }
}
