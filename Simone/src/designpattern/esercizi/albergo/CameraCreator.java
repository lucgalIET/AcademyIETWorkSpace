package designpattern.esercizi.albergo;

public abstract class CameraCreator {
    private int numeroLetti;
    private String vista;
    private String servizi;

    public CameraCreator(int numeroLetti, String vista, String servizi) {
        this.numeroLetti = numeroLetti;
        this.vista = vista;
        this.servizi = servizi;
    }

    public abstract Camera creaCamera(int numeroLetti,String vista,String servizi);

    public void assegnaCamera(){
        Camera camera= creaCamera(numeroLetti,vista,servizi);
        camera.mostraDettagliCamera();
    }

}
