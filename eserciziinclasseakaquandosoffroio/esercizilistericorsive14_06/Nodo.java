package eserciziinclasseakaquandosoffroio.esercizilistericorsive14_06;

public class Nodo<E> {
    private E value;
    private Nodo<E> nodoSuccessivo;

    public Nodo(E value) {
        this.value = value;
        this.nodoSuccessivo = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Nodo<E> getNodoSuccessivo() {
        return nodoSuccessivo;
    }

    public void setNodoSuccessivo(Nodo<E> nodo) {
        this.nodoSuccessivo = nodo;
    }



    //Implementa una funzione ricorsiva in Java che prenda in
    // input una lista di elementi e restituisca una nuova lista con gli elementi invertiti rispetto all'originale.
}
