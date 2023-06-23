package designpattern.esercizi.pizzeria;

public class QuattroFormaggi implements Pizza{
    private String ingredienti;

    public QuattroFormaggi(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public void mostraIngredienti() {
        System.out.println("Ingredienti Quattro Formaggi: "+ingredienti);
    }

    @Override
    public void cuociPizza() {
        System.out.println("Stiamo preparando la Quattro Formaggi!");
    }
}
