package designpattern.memento;

import java.util.Stack;

// caretaker
public class History {

    private Stack<EditorMemento> stackMemento = new Stack<>();

    public void push(EditorMemento memento) {
        stackMemento.push(memento);
    }

    public EditorMemento pop() {
        return stackMemento.pop();
    }
}
