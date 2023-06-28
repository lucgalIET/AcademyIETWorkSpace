package Ciro.designpatter.playlist;

import java.util.List;

//Esercizio n
//        Sviluppare un'applicazione per la creazione di un sistema di gestione di playlist musicali.
//        Ogni playlist può contenere diverse canzoni con attributi come il titolo, l'artista, l'album, la durata, ecc.
//        La classe 'x' dovrebbe fornire metodi per aggiungere canzoni alla playlist, impostare il titolo, ordinare le canzoni, ecc.
public interface PlaylistBuilder {
    void setTitoloPlaylist(String titolo);
    List<Canzone> ordinaCanzoni();
    void aggiungiCanzone(Canzone canzone);
    Playlist getPlaylist();

}
