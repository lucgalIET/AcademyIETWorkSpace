package designpattern.composite;

public class MainComposite {

    public static void main(String[] args) {
        DipendenteLeaf dipendenteLeaf1 = new DipendenteLeaf("Mario", "Rossi");
        DipendenteLeaf dipendenteLeaf2 = new DipendenteLeaf("Maria", "Rossi");

        RepertoComposite repertoComposite = new RepertoComposite("Ciele", "via tal dei tali");

        repertoComposite.aggiungiDipendente(dipendenteLeaf1);
        repertoComposite.aggiungiDipendente(dipendenteLeaf2);

        repertoComposite.mostraDettagliDipendente();



    }
}
