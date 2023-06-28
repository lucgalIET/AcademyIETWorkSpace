package inClasse.esercizio_21_06_2023;

public abstract class Race {

    private String nome;

    public Race(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " "+ nome;
    }
}
