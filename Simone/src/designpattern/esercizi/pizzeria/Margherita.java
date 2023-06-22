package designpattern.esercizi.pizzeria;

public class Margherita implements Pizza{

    private String ingredienti;

    public Margherita(String ingredienti) {
        this.ingredienti = ingredienti;
    }


    @Override
    public void mostraIngredienti() {
        System.out.println("Ingredienti Margherita: "+ingredienti);
    }

    @Override
    public void cuociPizza() {
        System.out.println("Stiamo preparando la Margherita!");
    }
}
