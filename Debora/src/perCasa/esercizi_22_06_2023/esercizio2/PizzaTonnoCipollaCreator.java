package perCasa.esercizi_22_06_2023.esercizio2;

public class PizzaTonnoCipollaCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new PizzaTonnoCipolla();
    }
}
