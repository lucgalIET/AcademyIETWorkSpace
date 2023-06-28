package perCasa.esercizi_08_06_2023.Esercizio2.SecondaVersione;

public class Product {

    private String name;
    private double price;

    public Product(){

    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: "+ name+ ", ");
        sb.append("price: "+ price);
        return sb.toString();
    }
}
