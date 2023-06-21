package marcoMacri.src.eserciziCasa.Es19_6_23.Es4Prototype;

public class Cerchio implements OggGeometrico{
    private int raggio;

    @Override
    public void perimetro() {
        System.out.println("perimetro del cerchio: "+(raggio*2)*3.14);
    }

    public Cerchio(int raggio) {
        this.raggio = raggio;
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