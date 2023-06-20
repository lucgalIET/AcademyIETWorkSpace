package marcoMacri.src.eserciziCasa.Es19_6_23.Es4;

public class Quadrato implements OggGeometrico{
    private int lato;
    @Override
    public void perimetro() {
        System.out.println("il perimetro del quadrato è:" + lato*4);
    }

    public Quadrato(int lato) {
        this.lato = lato;
    }

    @Override
    public OggGeometrico clonaOggGeometrico() {
        try {
            return (OggGeometrico) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}