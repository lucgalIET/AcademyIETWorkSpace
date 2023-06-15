package Ciro.ListeRicorsive.esercizio1;
/*
Somma degli elementi di una lista ricorsiva
Implementa una funzione ricorsiva in Java che prenda in input una lista di interi rappresentata come una lista ricorsiva di nodi
e restituisca la somma di tutti gli elementi nella lista. Testa la tua funzione utilizzando diverse liste di interi.

 */
public class Nodo {
    private int value;
    private Nodo next;

    public Nodo(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
