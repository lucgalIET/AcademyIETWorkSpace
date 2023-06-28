package perCasa.esercizi_08_06_2023.Esercizio2;

/*
Scrivi un programma Java che crea una classe Product con i campi id (identificatore), name e price.
Il programma chiede all'utente di inserire i dati di tre prodotti e li salva in una lista di oggetti Product.
Successivamente, scrivi i dati della lista su un file di testo e leggi il file per visualizzare i prodotti sullo schermo.
bonus:utilizzo di map
*/

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
