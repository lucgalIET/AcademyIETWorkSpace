package perCasa.esercizi_22_06_2023.esercizio2;

public class PizzaPrimaveraCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new PizzaPrimavera();
    }
}
