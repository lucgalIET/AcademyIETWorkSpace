package perCasa.esercizi_22_06_2023.esercizio2;

public class PizzaDiavolaCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new PizzaDiavola();
    }
}
