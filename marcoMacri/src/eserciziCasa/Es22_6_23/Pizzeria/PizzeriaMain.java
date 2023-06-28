package marcoMacri.src.eserciziCasa.Es22_6_23.Pizzeria;

public class PizzeriaMain {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaMargherita();
        PizzaDirector pizzaDirector = new PizzaDirector(pizzaBuilder);

        Pizza margherita = pizzaDirector.constructorPizza();
        System.out.println(margherita);

        PizzaBuilder pizzaBuilder1 = new PizzaDiavola();
        PizzaDirector pizzaDirector1 = new PizzaDirector(pizzaBuilder);

        Pizza pizzaDiavola = pizzaDirector.constructorPizza();
        System.out.println(pizzaDiavola);

        PizzaBuilder pizzaBuilder2 = new PizzaQuattroFormaggi();
        PizzaDirector pizzaDirector2 = new PizzaDirector(pizzaBuilder);

        Pizza quattroFormaggi = pizzaDirector.constructorPizza();
        System.out.println(quattroFormaggi);
    }
}