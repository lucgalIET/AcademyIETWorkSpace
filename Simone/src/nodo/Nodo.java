package nodo;

public class Nodo<T> {
    private int valore;
    private Nodo<T> nodoSuccessivo;

    public Nodo(int valore) {
        this.valore = valore;
        this.nodoSuccessivo = null;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public Nodo<T> getNodoSuccessivo() {
        return nodoSuccessivo;
    }

    public void setNodoSuccessivo(Nodo<T> nodoSuccessivo) {
        this.nodoSuccessivo = nodoSuccessivo;
    }
}
