package marcoMacri.src.eserciziLezione.Es21_06_23;

import marcoMacri.src.eserciziLezione.Es21_06_23.classe.Classe;
import marcoMacri.src.eserciziLezione.Es21_06_23.race.Race;

public class Character {
    private Race race;

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    private Classe classe;
    private String phisicalAspect;
    private String specialSkills;
    private String equipment;

    public Character() {
    }

    public Character(Race race, String phisicalAspect, String specialSkills, String equipment) {
        this.race = race;
        this.phisicalAspect = phisicalAspect;
        this.specialSkills = specialSkills;
        this.equipment = equipment;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getPhisicalAspect() {
        return phisicalAspect;
    }

    public void setPhisicalAspect(String phisicalAspect) {
        this.phisicalAspect = phisicalAspect;
    }

    public String getSpecialSkills() {
        return specialSkills;
    }

    public void setSpecialSkills(String specialSkills) {
        this.specialSkills = specialSkills;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
