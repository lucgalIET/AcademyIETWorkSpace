package inClasse.esercizio_21_06_2023;

public abstract class Type {

    private String nome;

    public Type(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " "+ nome;
    }
}
