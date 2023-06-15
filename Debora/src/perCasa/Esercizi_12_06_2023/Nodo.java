package perCasa.Esercizi_12_06_2023;

public class Nodo <E>{

    private E valore;
    private Nodo<E> nodoSuccessivo;

    public Nodo(E valore) {
        this.valore = valore;
        this.nodoSuccessivo = null;
    }

    public E getValore() {
        return valore;
    }

    public void setValore(E valore) {
        this.valore = valore;
    }

    public Nodo<E> getNodoSuccessivo() {
        return nodoSuccessivo;
    }

    public void setNodoSuccessivo(Nodo<E> nodoSuccessivo) {
        this.nodoSuccessivo = nodoSuccessivo;
    }
}
