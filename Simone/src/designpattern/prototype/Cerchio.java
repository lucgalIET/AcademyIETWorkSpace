package designpattern.prototype;
/*

Immagina di dover creare un'applicazione per la gestione di oggetti geometrici.
Implementa il Prototype pattern per la creazione di istanze di oggetti geometrici
come "Cerchio" e "Quadrato". Utilizza il Prototype pattern per creare copie esatte
 degli oggetti geometrici esistenti invece di crearne uno nuovo ogni volta.

 */

public class Cerchio implements OggGeometrico {
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
