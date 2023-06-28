package Ciro.designpatter.prototype;

//builder astratto
public interface PizzaBuilder {
    void ingredientiPizza();
    void nomePizza();
    void prezzoPizza();
    Pizza getPizza();
}
