package designpattern.memento;

public class MementoMain {
    public static void main(String[] args) {

        Editor editor = new Editor(); //oggetto da modificare e recuperare
        History history = new History();

        editor.setContenuto("Sono l'oggetto editor alla 1a modifica");
        history.push(editor.save());

        System.out.println("1a : " + editor.getContenuto() + "\n");

        editor.setContenuto("Sono l'oggetto editor alla 2a modifica");
        history.push(editor.save());

        System.out.println("2a : " + editor.getContenuto() + "\n");

        editor.setContenuto("Sono l'oggetto editor alla 3a modifica");
        history.push(editor.save());


        editor.restore(history.pop());
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println("Oggetto ripristinato: -> " + editor.getContenuto());
    }
}
