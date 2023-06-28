package designpatternplaylist;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Playlist implements PlaylistBuilder{

    private String titolo;
    private List<Canzone> playlist = new ArrayList<>();

    public Playlist() {

    }
    public Playlist(String titolo, List<Canzone> playlist) {
        this.titolo = titolo;
        this.playlist = playlist;

    }



    @Override
    public void setTitoloPlaylist(String titolo) {
        this.titolo= titolo;

    }

    @Override
    public List<Canzone> ordinaCanzoni() {
        return this.playlist.stream().sorted(Comparator.comparing(Canzone::getTitolo)).toList();

    }

    @Override
    public void aggiungiCanzone(Canzone canzone) {
        this.playlist.add(canzone);

    }

    @Override
    public Playlist getPlaylist() {
        return this;
    }

    @Override
    public String toString() {
        return "Playlist \n" +
                "titolo='" + titolo + "\n" +
                ", playlist=" + playlist +
                '}';
    }
}