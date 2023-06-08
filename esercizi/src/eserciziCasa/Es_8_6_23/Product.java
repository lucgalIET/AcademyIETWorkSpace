package esercizi.src.eserciziCasa.Es_8_6_23;
//Esercizio 2:
//        Scrivi un programma Java che crea una classe Product con i campi id (identificatore), name e price.
//        Il programma chiede all'utente di inserire i dati di tre prodotti e li salva in una lista di oggetti Product.
//        Successivamente, scrivi i dati della lista su un file di testo e leggi il file per visualizzare i prodotti sullo schermo.
//        bonus:utilizzo di map
public class Product {
    private double id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(double id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: \n" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price ;
    }
}
