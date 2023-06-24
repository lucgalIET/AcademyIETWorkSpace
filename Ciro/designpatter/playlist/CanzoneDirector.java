package Ciro.designpatter.playlist;

public class CanzoneDirector {
    private CanzoneBuilder canzoneBuilder;

    public CanzoneDirector (CanzoneBuilder canzoneBuilder){this.canzoneBuilder = canzoneBuilder;}

    public Canzone constructorCanzone(Canzone canzone){
        this.canzoneBuilder.setAlbum(canzone.getAlbum());
        this.canzoneBuilder.setArtista(canzone.getArtista());
        this.canzoneBuilder.setDurata(canzone.getDurata());
        this.canzoneBuilder.setTitolo(canzone.getTitolo());
        return this.canzoneBuilder.getCanzone();

    }
}
