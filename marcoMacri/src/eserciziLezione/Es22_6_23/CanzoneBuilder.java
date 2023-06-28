package marcoMacri.src.eserciziLezione.Es22_6_23;

public interface CanzoneBuilder {
    void setArtista(String artista);
    void setAlbum(String album);
    void setDurata(int durata);
    void setTitolo(String titolo);

    Canzone getCanzone();

}
