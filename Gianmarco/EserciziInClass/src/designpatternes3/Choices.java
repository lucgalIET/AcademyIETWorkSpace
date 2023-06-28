package designpatternes3;
/*
Testo dell'esercizio:
Sviluppare un'applicazione per la creazione di un videogioco in cui i giocatori possono creare
il proprio personaggio scegliendo tra diverse razze (umani, elfi, orchi, ecc.)
e classi (guerrieri, maghi, ladri, ecc.).
Inoltre, i giocatori possono personalizzare il personaggio selezionando attributi
come l'aspetto fisico, l'equipaggiamento e le abilità speciali.
 */
public interface Choices {
    Race choseRace();
    Type choseType();
}

//creare un oggetto che contenga tutti quei parametri(razza,tipo,altri 3)
//fare una stampa di tutte le caratteristiche senza creare un oggetto