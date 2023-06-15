package flussi;
//Esercizio 2
public class Product {
    private String id;
    private String nome;
    private int prezzo;

    public Product() {
    }

    public Product(String id, String nome, int prezzo) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
