package designpattern.esercizi.pizzeria;

public class DiavolaCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new Diavola("Pomodoro, Mozzarella, Salame Piccante, Olio");
    }
}
