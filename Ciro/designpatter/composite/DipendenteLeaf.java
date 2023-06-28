package Ciro.designpatter.composite;

public class DipendenteLeaf implements DipendenteComponent{

    private String nome;
    private String cognome;

    public DipendenteLeaf(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }


    @Override
    public void mostraDettagliDipendente() {
        System.out.println("Nome del dipendente " + nome);
        System.out.println("Cognome del dipendente " + cognome);
    }
}
