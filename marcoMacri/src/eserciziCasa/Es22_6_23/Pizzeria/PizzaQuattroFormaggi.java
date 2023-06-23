package marcoMacri.src.eserciziCasa.Es22_6_23.Pizzeria;

public class PizzaQuattroFormaggi implements PizzaBuilder {
    private Pizza pizza;

    public PizzaQuattroFormaggi() {
        this.pizza = new Pizza();
    }

    @Override
    public void ingredientiPizza() {
        pizza.setIngredienti("Pomodoro, mozzarella, pecorino, grana, gorgonzola");
    }

    @Override
    public void nomePizza() {
        pizza.setNome("Quattro Formaggi");
    }

    @Override
    public void prezzoPizza() {
        pizza.setPrezzo(6);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
