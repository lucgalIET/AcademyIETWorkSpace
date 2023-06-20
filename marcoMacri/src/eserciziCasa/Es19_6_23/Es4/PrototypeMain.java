package marcoMacri.src.eserciziCasa.Es19_6_23.Es4;

//Esercizio su Prototype:
//
//        Sviluppare un'applicazione in java per la gestione di oggetti geometrici. Implementa il Prototype pattern
//        per la creazione di istanze di oggetti geometrici come "Cerchio" e "Quadrato".
//        Utilizza il Prototype pattern per creare copie esatte degli oggetti geometrici esistenti invece di crearne uno nuovo ogni volta.
public class PrototypeMain {
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

