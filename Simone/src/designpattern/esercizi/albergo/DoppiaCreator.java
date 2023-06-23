package designpattern.esercizi.albergo;

public class DoppiaCreator extends CameraCreator{
    public DoppiaCreator(int numeroLetti, String vista, String servizi) {
        super(numeroLetti, vista, servizi);
    }

    @Override
    public Camera creaCamera(int numeroLetti, String vista,String servizi) {
        return new Doppia(numeroLetti,vista,servizi);
    }
}
