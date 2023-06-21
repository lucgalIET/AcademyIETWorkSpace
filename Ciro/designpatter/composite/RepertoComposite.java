package Ciro.designpatter.composite;

import java.util.LinkedList;
import java.util.List;

public class RepertoComposite implements DipendenteComponent{
    private String nome;
    private String indirizzo;
    private List<DipendenteLeaf> listaDipendenti = new LinkedList<>();

    public RepertoComposite(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    public void aggiungiDipendente(DipendenteLeaf dipendente){
        listaDipendenti.add(dipendente);
        System.out.println("Il dipendente è stato aggiunto al reparto e può lavorare!");
    }

    public void rimuoviDipendente(DipendenteLeaf dipendente){
        listaDipendenti.remove(dipendente);
        System.out.println("il dipendente è stato licenziato!");
    }
    @Override
    public void mostraDettagliDipendente() {
        for(DipendenteLeaf dip: listaDipendenti){
            dip.mostraDettagliDipendente();
        }

    }
}
