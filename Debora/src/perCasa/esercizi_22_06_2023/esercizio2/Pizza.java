package perCasa.esercizi_22_06_2023.esercizio2;

import java.util.Set;

public interface Pizza {

    String getNome();
    Set<Ingrediente> getListaIngredienti();
    Set<Ingrediente> getListaIngredientiDaScegliere();
    double prezzo();
    void aggiungiIngrediente(Ingrediente ingrediente);
    boolean ingredienteExtra();
}
