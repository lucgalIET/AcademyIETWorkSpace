package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private String race;
    private String type;
    private List<String> equipment = new ArrayList<>();
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

    public void addEquipment(String equipment) {
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
        sb.append("[").append("Name: "+name).append(" Race: "+race).append(" Class: "+type).append("]");
        return sb.toString();
    }
}
