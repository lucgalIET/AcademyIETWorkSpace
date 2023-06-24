package Ciro.designpatter.playlist;
//Esercizio n
//        Sviluppare un'applicazione per la creazione di un sistema di gestione di playlist musicali.
//        Ogni playlist può contenere diverse canzoni con attributi come il titolo, l'artista, l'album, la durata, ecc.
//        La classe 'x' dovrebbe fornire metodi per aggiungere canzoni alla playlist, impostare il titolo, ordinare le canzoni, ecc.
public class Canzone implements CanzoneBuilder{

    private String artista;
    private String album;
     private int durata;
     private String titolo;

    public Canzone() {
    }

    public Canzone(String artista, String album, int durata, String titolo) {
        this.artista = artista;
        this.album = album;
        this.durata = durata;
        this.titolo = titolo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public Canzone getCanzone() {
        return this;
    }

    @Override
    public String toString() {
        return "Canzone \n" +
                "artista='" + artista  +
                ", album='" + album  +
                ", durata=" + durata +
                ", titolo='" + titolo + '\'' +
                '}';
    }
}
