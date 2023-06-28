package designpattern.esercizi.pizzeria;

public class MargheritaCreator extends PizzaCreator {
    @Override
    public Pizza creaPizza() {
        return new Margherita("Basilico, Pomodoro, Mozzarella, Olio");
    }
}
