package Ciro.designpatter.pizzeria;

public class PizzaNapoletana implements Pizza {

    final static double prezzo = 3.5;
    String ingredienti = "pomodoro, origano, aglio";

    @Override
    public String getNome() {
        return "Pizza Napoletana";
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String mostraIngredienti() {
        return  ingredienti;
    }

}
