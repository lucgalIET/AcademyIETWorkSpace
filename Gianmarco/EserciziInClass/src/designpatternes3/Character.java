//package designpatternes3;
///*
//Testo dell'esercizio:
//Sviluppare un'applicazione per la creazione di un videogioco in cui i giocatori possono creare
//il proprio personaggio scegliendo tra diverse razze (umani, elfi, orchi, ecc.)
//e classi (guerrieri, maghi, ladri, ecc.).
//Inoltre, i giocatori possono personalizzare il personaggio selezionando attributi
//come l'aspetto fisico, l'equipaggiamento e le abilità speciali.
// */
//public class Character implements CharacterBuilder{
//    private String name;
//    private Race race;
//    private Type type;
//
//    private String appearence;
//    private String equip;
//    private String abilities;
//
//
//    @Override
//    public String toString() {
//        return "Character{" +
//                "name='" + name + '\'' +
//                ", race=" + race +
//                ", type=" + type +
//                '}';
//    }
//
//    @Override
//    public void choseName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void choseRace(Race race) {
//        this.race = race;
//    }
//
//    @Override
//    public void choseType(Type type) {
//    this.type = type;
//    }
//
//    @Override
//    public void appearence(String appearence) {
//        this.appearence = appearence;
//    }
//
//    @Override
//    public void equip(String equip) {
//        this.equip= equip;
//    }
//
//    @Override
//    public void abilities(String abilities) {
//        this.abilities=abilities;
//    }
//
//
//    @Override
//    public Character getCharacter() {
//        return this;
//    }
//}

