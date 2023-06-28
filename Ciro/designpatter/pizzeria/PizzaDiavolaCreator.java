package Ciro.designpatter.pizzeria;

public class PizzaDiavolaCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new PizzaDiavola();
    }
}
