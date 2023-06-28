package manuel.eserciziacasa.esercizicreationaldp.esercizio2;

public class Automobile {
    private String marca;
    private String modello;
    private int annoDiProduzione;

    public Automobile() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnnoDiProduzione() {
        return annoDiProduzione;
    }

    public void setAnnoDiProduzione(int annoDiProduzione) {
        this.annoDiProduzione = annoDiProduzione;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[").append("Marca: "+marca).append(" | Modello: "+modello).append(" | Anno di produzione: "+annoDiProduzione).append("]");
        return sb.toString();
    }
}
