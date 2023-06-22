package perCasa.esercizi_22_06_2023.esercizio2;

public class PizzaMargheritaCreator extends PizzaCreator{
    @Override
    public Pizza creaPizza() {
        return new PizzaMargherita();
    }
}
