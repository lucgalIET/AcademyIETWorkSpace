package ListeRicorsive;

import org.w3c.dom.NodeList;

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

    public void setNodoSuccessivo(Nodo nodo) {
        this.nodoSuccessivo = nodo;
    }
}
