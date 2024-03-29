package marcoMacri.src.eserciziCasa.Es22_6_23.Pizzeria;

public class PizzaDirector {

    public PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza constructorPizza(){
        pizzaBuilder.ingredientiPizza();
        pizzaBuilder.nomePizza();
        pizzaBuilder.prezzoPizza();
        return pizzaBuilder.getPizza();
    }

}
