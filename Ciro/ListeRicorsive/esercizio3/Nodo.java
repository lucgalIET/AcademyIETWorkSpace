package Ciro.ListeRicorsive.esercizio3;
/*
Concatenazione di due liste ricorsive
Implementa una funzione ricorsiva in Java che prenda in input due liste di interi rappresentate come liste ricorsive di
nodi e restituisca una nuova lista che sia la concatenazione delle due liste di input. Testa la tua funzione utilizzando
diverse combinazioni di liste di interi.
 */
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
