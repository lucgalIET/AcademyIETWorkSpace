package manuel.eserciziacasa.esercizilistericorsive;

public class Esercizi {
    public Esercizi() {
    }

    public int sommaLista(Nodo nodo){
        if(nodo == null) return 0;
        return nodo.getValue() + sommaLista(nodo.getNextElement());
    }

    public boolean ordineCrescente(Nodo nodo){
        if(nodo.getNextElement() == null) return true;
        if(nodo.getValue() > nodo.getNextElement().getValue()) return false;
        return ordineCrescente(nodo.getNextElement());
    }

    public void unioneListe(Nodo nodo1, Nodo nodo2){
        if(nodo1.getNextElement() == null) {
            nodo1.setNextElement(nodo2);
            return;
        }
        unioneListe(nodo1.getNextElement(), nodo2);
    }

    public String concatenaStringhe(NodoString nodo){
        if(nodo == null) return "";
        return nodo.getValue() + concatenaStringhe(nodo.getNextElement());
    }

}
