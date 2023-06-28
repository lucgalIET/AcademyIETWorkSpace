package designpattern.esercizi.albergo;

public class SingolaCreator extends CameraCreator{

    public SingolaCreator(int numeroLetti, String vista, String servizi) {
        super(numeroLetti, vista, servizi);
    }

    @Override
    public Camera creaCamera(int numeroLetti, String vista,String servizi) {
        return new Singola(numeroLetti,vista,servizi);
    }

}
