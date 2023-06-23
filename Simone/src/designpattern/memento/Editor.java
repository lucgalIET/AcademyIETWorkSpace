package designpattern.memento;

//Originator
public class Editor {
    private String contenuto; //rapprestentera' il suo stato

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public EditorMemento save() {
        return new EditorMemento(contenuto);
    }

    public void restore(EditorMemento memento) {
        contenuto = memento.getContenuto();
    }

}
