package perCasa.esercizi_14_06_2023;

public class Nodo<T> {

    private T valore;
    private Nodo nodoSuccessivo;

    public Nodo(T valore){
        this.valore = valore;
        this.nodoSuccessivo = null;
    }

    public T getValore(){
        return valore;
    }

    public void setValore(T valore){
        this.valore = valore;

    }

    public Nodo<T> getNodoSuccessivo(){
        return nodoSuccessivo;
    }

    public void setNodoSuccessivo(Nodo<T> nodoSuccessivo){
        this.nodoSuccessivo = nodoSuccessivo;
    }

}
