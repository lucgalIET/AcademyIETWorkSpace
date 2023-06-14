package eserciziPerCasa.ListeRicorsive.esercizio2;
/*
Verifica se una lista ricorsiva è ordinata in modo crescente
Implementa una funzione ricorsiva in Java che prenda in input una lista di numeri interi rappresentata come una lista ricorsiva
 di nodi e restituisca true se la lista è ordinata in modo crescente, altrimenti restituisca false.
 Testa la tua funzione utilizzando diverse liste di numeri
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
