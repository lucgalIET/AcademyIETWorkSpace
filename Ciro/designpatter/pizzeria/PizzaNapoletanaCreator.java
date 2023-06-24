package Ciro.designpatter.pizzeria;

public class PizzaNapoletanaCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new PizzaNapoletana();
    }
}
