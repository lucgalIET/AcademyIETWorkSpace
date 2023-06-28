package ListeRicorsive;



public class Nodo {
    private int value;
    private Nodo nodoSuccessivo;

    public Nodo(int value) {
        this.value = value;
        this.nodoSuccessivo = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getNodoSuccessivo() {
        return nodoSuccessivo;
    }

    public void setNodoSuccessivo(Nodo nodoSuccessivo) {
        this.nodoSuccessivo = nodoSuccessivo;
    }

    @Override
    public String toString() {
        return "Nodo:" + value + " "+ nodoSuccessivo;
    }
}
