package designpattern3_1;
/*
Testo dell'esercizio:
Sviluppare un'applicazione per la creazione di un videogioco in cui i giocatori possono creare
il proprio personaggio scegliendo tra diverse razze (umani, elfi, orchi, ecc.)
e classi (guerrieri, maghi, ladri, ecc.).
Inoltre, i giocatori possono personalizzare il personaggio selezionando attributi
come l'aspetto fisico, l'equipaggiamento e le abilità speciali.
 */
public class Character {
    private String race;
    private String type;
    private String appearence;
    private String abilities;
    private String equip;


    public String getRace() {
        return race;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAppearence() {
        return appearence;
    }

    public void setAppearence(String appearence) {
        this.appearence = appearence;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }
}
