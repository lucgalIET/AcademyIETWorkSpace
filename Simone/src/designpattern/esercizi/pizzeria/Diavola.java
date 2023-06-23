package designpattern.esercizi.pizzeria;

public class Diavola implements Pizza {

    private String ingredienti;

    public Diavola(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public void mostraIngredienti() {
        System.out.println("Ingredienti Diavola: "+ingredienti);
    }

    @Override
    public void cuociPizza() {
        System.out.println("Stiamo preparando la Diavola!");
    }
}
