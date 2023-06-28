package inClasse.esercizio_21_06_2023;

public class Character implements CharacterBuilder{

    private String name;
    private Race race;
    private Type type;

    private String appearence;
    private String equip;
    private String abilities;

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setAppearence(String appearence) {
        this.appearence = appearence;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    @Override
    public String choseName() {
        setName(Choices.getName());
        return name;
    }

    @Override
    public Race choseRace() {
        setRace(Choices.getRace());
        return race;
    }

    @Override
    public Type choseType() {
        setType(Choices.getType());
        return type;
    }

    @Override
    public String appearence() {
        setAppearence(Choices.getAppereance());
        return appearence;
    }

    @Override
    public String equip() {
        setEquip(Choices.getEquip());
        return equip;
    }

    @Override
    public String abilities() {
        setAbilities(Choices.getAbilities());
        return abilities;
    }

    @Override
    public Character getCharacter() {
        return this;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", race=" + race +
                ", type=" + type +
                ", appearence='" + appearence + '\'' +
                ", equip='" + equip + '\'' +
                ", abilities='" + abilities + '\'' +
                '}';
    }
}