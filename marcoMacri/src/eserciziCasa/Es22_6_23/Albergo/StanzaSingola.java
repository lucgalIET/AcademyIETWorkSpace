package marcoMacri.src.eserciziCasa.Es22_6_23.Albergo;

public class StanzaSingola implements AlbergoBuilder {

    private Albergo albergo;

    public StanzaSingola() {
        this.albergo = new Albergo();
    }

    @Override
    public void tipoStanza() {
        albergo.setNumeroCamera("1");
    }

    @Override
    public void numeroStanza() {
        albergo.setTipoCamera("singola");
    }

    @Override
    public void prezzoStanza() {
        albergo.setPrezzo(25);
    }

    @Override
    public Albergo getStanza() {
        return albergo;
    }
}
