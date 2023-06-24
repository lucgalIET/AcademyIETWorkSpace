package Ciro.designpatter.playlist;

public interface CanzoneBuilder {
    void setArtista(String artista);
    void setAlbum(String album);
    void setDurata(int durata);
    void setTitolo(String titolo);

    Canzone getCanzone();

}
