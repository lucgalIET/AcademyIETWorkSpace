package designpattern3_1;
/*
Testo dell'esercizio:
Sviluppare un'applicazione per la creazione di un videogioco in cui i giocatori possono creare
il proprio personaggio scegliendo tra diverse razze (umani, elfi, orchi, ecc.)
e classi (guerrieri, maghi, ladri, ecc.).
Inoltre, i giocatori possono personalizzare il personaggio selezionando attributi
come l'aspetto fisico, l'equipaggiamento e le abilità speciali.
 */
public class Main {
    public static void main(String[] args) {
        CharacterBuilder characterBuilder = new CharacterCreator();
        CharacterDirector characterDirector = new CharacterDirector(characterBuilder);

     characterDirector.createCharacter("umano","guerriero","bello","bastone","salto");
     Character character = characterDirector.getCharacter();
        System.out.println("Personaggio= " + " Razza: "+ character.getRace()
        + " classe: " + character.getType() + " Aspetto : "+ character.getAppearence() +
                " equipaggiamento: " + character.getEquip() + " abilità: "+ character.getAbilities());
    }
}
