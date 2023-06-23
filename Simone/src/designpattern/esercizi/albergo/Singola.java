package designpattern.esercizi.albergo;

public class Singola implements Camera{

    private int numeroLetti;
    private String vista;
    private String servizi;

    public Singola(int numeroLetti, String vista, String servizi) {
        this.numeroLetti = numeroLetti;
        this.vista = vista;
        this.servizi = servizi;
    }

    @Override
    public void mostraDettagliCamera() {
        System.out.println("Numero letti: "+numeroLetti);
        System.out.println("Vista: "+vista);
        System.out.println("Servizi: "+servizi);
    }

}
