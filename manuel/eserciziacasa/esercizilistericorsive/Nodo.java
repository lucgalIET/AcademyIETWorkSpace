package manuel.eserciziacasa.esercizilistericorsive;

public class Nodo {
    private int value;
    private Nodo nextElement;

    public Nodo(int value) {
        this.value = value;
        this.nextElement = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getNextElement() {
        return nextElement;
    }

    public void setNextElement(Nodo nextElement) {
        this.nextElement = nextElement;
    }
}
