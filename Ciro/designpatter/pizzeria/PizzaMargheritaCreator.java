package Ciro.designpatter.pizzeria;

public class PizzaMargheritaCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new PizzaMargherita();
    }
}
