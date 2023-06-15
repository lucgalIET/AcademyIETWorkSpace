package Ciro.esercizi_flussi_file.eserciio2;

public class Product {
    private final Integer id;
    private final String name;
    private final Double price;

    public Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String toString(){
        String sb = "prodotto [ " +
                "Nome: " + name +
                " Prezzo: " + price +
                " ]";
        return sb;

    }
}
