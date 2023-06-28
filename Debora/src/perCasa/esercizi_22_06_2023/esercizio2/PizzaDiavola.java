package perCasa.esercizi_22_06_2023.esercizio2;

import java.util.HashSet;
import java.util.Set;

public class PizzaDiavola implements Pizza {

    private Set<Ingrediente> listaIngredienti = new HashSet<>();
    private Set<Ingrediente> listaIngredientiEsclusi = new HashSet<>();
    boolean aggiunta = false;
    int count = 0;

    @Override
    public String getNome() {
        return "Pizza diavola";
    }

    @Override
    public Set<Ingrediente> getListaIngredienti() {
        listaIngredienti.add(Ingrediente.POMODORO);
        listaIngredienti.add(Ingrediente.MOZZARELLA);
        listaIngredienti.add(Ingrediente.SALAME);
        return listaIngredienti;
    }

    @Override
    public Set<Ingrediente> getListaIngredientiDaScegliere() {
        for (Ingrediente ing : Ingrediente.values()) {
            if (!listaIngredienti.contains(ing)) {
                listaIngredientiEsclusi.add(ing);
            }
        }
        return listaIngredientiEsclusi;
    }

    @Override
    public double prezzo() {
        if (aggiunta) {
            return 5.5 + (count * 0.5);
        }
        return 5.5;
    }

    @Override
    public void aggiungiIngrediente(Ingrediente ingrediente) {
        aggiunta = true;
        count++;
        listaIngredienti.add(ingrediente);
        System.out.println("Hai aggiunto un nuovo ingrediente, ecco i dettagli della tua pizza:");
        System.out.println(getNome());
        System.out.println("lista ingredienti: " + listaIngredienti);
        System.out.println("prezzo: " + prezzo());
    }

    @Override
    public boolean ingredienteExtra() {
        return aggiunta;
    }
}
