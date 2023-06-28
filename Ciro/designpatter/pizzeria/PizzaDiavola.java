package Ciro.designpatter.pizzeria;

import java.util.HashSet;
import java.util.Set;

public class PizzaDiavola implements Pizza {

    final static double prezzo = 6.5;
    String ingredienti = "pomodoro, mozzarella, salame";
    @Override
    public String getNome() {
        return "Pizza diavola";
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
