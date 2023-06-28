package designpatter.es1;
/*

Immagina di dover creare un'applicazione per la gestione di oggetti geometrici.
Implementa il Prototype pattern per la creazione di istanze di oggetti geometrici
come "Cerchio" e "Quadrato". Utilizza il Prototype pattern per creare copie esatte
 degli oggetti geometrici esistenti invece di crearne uno nuovo ogni volta.

 */
public class es1{
    public static void main(String[] args) {

        Cerchio cerchio = new Cerchio(10);

        Quadrato quadrato = new Quadrato(4);

        OggGeometrico quadrato2 = quadrato.clonaOggGeometrico();

        OggGeometrico cerchio2 = cerchio.clonaOggGeometrico();
        cerchio.perimetro();
        quadrato.perimetro();
        cerchio2.perimetro();
        quadrato2.perimetro();

    }
}
