package designpattern.esercizi.pizzeria;

public abstract class PizzaCreator {

    public abstract Pizza creaPizza();

    public void preparaPizza(){
        Pizza pizza= creaPizza();
        pizza.mostraIngredienti();
        pizza.cuociPizza();

    }
}
