package marcoMacri.src.eserciziCasa.Es22_6_23.Albergo;

public class StanzaDoppia implements AlbergoBuilder {

    private Albergo albergo;

    public StanzaDoppia() {
        this.albergo = new Albergo();
    }

    @Override
    public void tipoStanza() {
        albergo.setNumeroCamera("2");
    }

    @Override
    public void numeroStanza() {
        albergo.setTipoCamera("doppia");
    }

    @Override
    public void prezzoStanza() {
        albergo.setPrezzo(50);
    }

    @Override
    public Albergo getStanza() {
        return albergo;
    }
}
