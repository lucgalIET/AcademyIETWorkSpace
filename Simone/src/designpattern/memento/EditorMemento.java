package designpattern.memento;

// Memento
public class EditorMemento {
    private String contenuto;

    public EditorMemento(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }
}
