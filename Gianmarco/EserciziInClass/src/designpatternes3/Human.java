package designpatternes3;
/*
Testo dell'esercizio:
Sviluppare un'applicazione per la creazione di un videogioco in cui i giocatori possono creare
il proprio personaggio scegliendo tra diverse razze (umani, elfi, orchi, ecc.)
e classi (guerrieri, maghi, ladri, ecc.).
Inoltre, i giocatori possono personalizzare il personaggio selezionando attributi
come l'aspetto fisico, l'equipaggiamento e le abilità speciali.
 */
public class Human extends Race implements Choices{
    @Override
    public Race choseRace() {
        return new Human();
    }

    @Override
    public Type choseType() {
        return null;
    }

}