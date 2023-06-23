package designpattern.esercizi.albergo;

public class SuiteCreator extends CameraCreator {
    public SuiteCreator(int numeroLetti, String vista, String servizi) {
        super(numeroLetti, vista, servizi);
    }

    @Override
    public Camera creaCamera(int numeroLetti, String vista, String servizi) {
        return new Suite(numeroLetti, vista, servizi);
    }
}
