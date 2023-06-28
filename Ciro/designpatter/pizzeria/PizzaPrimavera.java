package Ciro.designpatter.pizzeria;

import java.util.HashSet;
import java.util.Set;

public class PizzaPrimavera implements Pizza {

    final static double prezzo = 5.0;
    String ingredienti = "pomodoro, mozzarella, prosciutto, rucola, grana";
    @Override
    public String getNome() {
        return "Pizza primavera";
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String mostraIngredienti() {
        return ingredienti;
    }

}
