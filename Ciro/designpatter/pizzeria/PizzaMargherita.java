package Ciro.designpatter.pizzeria;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PizzaMargherita implements Pizza {

    final static double prezzo = 4.5;
    String ingredienti = "pomodoro, mozzarella";
    @Override
    public String getNome() {
        return "Pizza margherita";
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
