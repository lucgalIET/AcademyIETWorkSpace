package eserciziacasa.esercizilistericorsive;

public class NodoString {
    private String value;
    private NodoString nextElement;

    public NodoString(String value) {
        this.value = value;
        this.nextElement = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public NodoString getNextElement() {
        return nextElement;
    }

    public void setNextElement(NodoString nextElement) {
        this.nextElement = nextElement;
    }
}
