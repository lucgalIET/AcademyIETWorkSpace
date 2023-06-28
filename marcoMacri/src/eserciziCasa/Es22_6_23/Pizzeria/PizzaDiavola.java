package marcoMacri.src.eserciziCasa.Es22_6_23.Pizzeria;

public class PizzaDiavola implements PizzaBuilder{

    private Pizza pizza;

    public PizzaDiavola() {
        this.pizza = new Pizza();
    }

    @Override
    public void ingredientiPizza() {
        pizza.setIngredienti("Pomodoro, mozzarella, olio, basilico, peperoncino");
    }

    @Override
    public void nomePizza() {
        pizza.setNome("Diavola");
    }

    @Override
    public void prezzoPizza() {
        pizza.setPrezzo(5);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
