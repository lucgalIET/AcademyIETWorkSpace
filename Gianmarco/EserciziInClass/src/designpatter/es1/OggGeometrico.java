package designpatter.es1;
/*

Immagina di dover creare un'applicazione per la gestione di oggetti geometrici.
Implementa il Prototype pattern per la creazione di istanze di oggetti geometrici
come "Cerchio" e "Quadrato". Utilizza il Prototype pattern per creare copie esatte
 degli oggetti geometrici esistenti invece di crearne uno nuovo ogni volta.

 */
public interface OggGeometrico extends Cloneable {

       void perimetro();

      OggGeometrico clonaOggGeometrico();

}
