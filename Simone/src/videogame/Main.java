package videogame;

import videogame.characterbuilder.Character;
import videogame.characterbuilder.CharacterBuilder;
import videogame.characterbuilder.CharacterConstructor;
import videogame.characterbuilder.CharacterDirector;

/*

Sviluppare un'applicazione per la creazione di un videogioco in cui i giocatori possono creare
il proprio personaggio scegliendo tra diverse razze (umani, elfi, orchi, ecc.) e classi (guerrieri, maghi, ladri, ecc.).
Inoltre, i giocatori possono personalizzare il personaggio selezionando attributi come l'aspetto fisico, l'equipaggiamento e le abilità speciali.
 */
public class Main {
    public static void main(String[] args) {
        CharacterBuilder characterBuilder = new CharacterConstructor();
        CharacterDirector characterDirector = new CharacterDirector(characterBuilder);
        Character character = characterDirector.characterBuilder();
        System.out.println(character);
    }
}
