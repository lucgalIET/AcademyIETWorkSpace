package eserciziPerCasa.esercizi_flussi_file.eserciio2;

public class Product {
    private Integer id;
    private String name;
    private Double price;

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
        StringBuilder sb=new StringBuilder();
        sb.append("prodotto [ ");
        sb.append("Nome: " + name);
        sb.append(" Prezzo: " + price);
        sb.append(" ]");
        return sb.toString();

    }
}
