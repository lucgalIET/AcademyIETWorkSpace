package Ciro.designpatter.pizzeria;

public class PizzaPrimaveraCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new PizzaPrimavera();
    }
}
