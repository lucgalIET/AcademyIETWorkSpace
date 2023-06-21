package inClasse.esercizio_21_06_2023;

public class Choices {

    private static Race race;
    private static Type type;
    private static String appereance;
    private static String equip;
    private static String abilities;

    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Choices.name = name;
    }

    public static Race getRace() {
        return race;
    }

    public static void setRace(Race race) {
        Choices.race = race;
    }

    public static Type getType() {
        return type;
    }

    public static void setType(Type type) {
        Choices.type = type;
    }

    public static String getAppereance() {
        return appereance;
    }

    public static void setAppereance(String appereance) {
        Choices.appereance = appereance;
    }

    public static String getEquip() {
        return equip;
    }

    public static void setEquip(String equip) {
        Choices.equip = equip;
    }

    public static String getAbilities() {
        return abilities;
    }

    public static void setAbilities(String abilities) {
        Choices.abilities = abilities;
    }
}
