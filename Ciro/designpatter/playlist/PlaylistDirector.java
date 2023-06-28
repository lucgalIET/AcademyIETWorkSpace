package Ciro.designpatter.playlist;

public class PlaylistDirector {
    private PlaylistBuilder playlistBuilder;

    public PlaylistDirector (PlaylistBuilder playlistBuilder){this.playlistBuilder = playlistBuilder;}

    public Playlist constructorPlaylist(Canzone canzone){
        playlistBuilder.setTitoloPlaylist("Playlist 1");
        playlistBuilder.aggiungiCanzone(canzone);

        return playlistBuilder.getPlaylist();
    }
}
