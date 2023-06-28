package designpatternplaylist;

//Esercizio n
//        Sviluppare un'applicazione per la creazione di un sistema di gestione di playlist musicali.
//        Ogni playlist può contenere diverse canzoni con attributi come il titolo, l'artista, l'album, la durata, ecc.
//        La classe 'x' dovrebbe fornire metodi per aggiungere canzoni alla playlist, impostare il titolo, ordinare le canzoni, ecc.
public class PlaylistMain {
    public static void main(String[] args) {
        CanzoneBuilder canzoneBuilder= new Canzone();
        CanzoneDirector canzoneDirector= new CanzoneDirector(canzoneBuilder);
        Canzone canzone1 = canzoneDirector.constructorCanzone(new Canzone("artista1","album1",200,"titolo"));

        PlaylistBuilder playlistBuilder = new Playlist();
        PlaylistDirector playlistDirector = new PlaylistDirector(playlistBuilder);
        Playlist playlistFantastica = playlistDirector.constructorPlaylist(canzone1);

        System.out.println(playlistFantastica);
    }

}