package designpattern.esercizi.pizzeria;

public class QuattroFormaggiCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new QuattroFormaggi("Gorgonzola, Fontina, Mozzarella, Parmigiano, Olio");
    }
}
