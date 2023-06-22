package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder;

import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.creator.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private String race;
    private String type;
    private List<Weapon> equipment = new ArrayList<>();
    private List<String> abilities = new ArrayList<>();
    private List<String> appereance = new ArrayList<>();

    public Character() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addEquipment(Weapon equipment) {
        this.equipment.add(equipment);
    }

    public void addAbilities(String abilities) {
        this.abilities.add(abilities);
    }

    public void addAppereance(String appereance) {
        this.appereance.add(appereance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append("Name: "+name).append(" Race: "+race).append(" Class: "+type).append("]").append("\n");
        sb.append("Inventory: ");
        equipment.forEach(x -> sb.append("["+x+"]"));
        return sb.toString();
    }
}
