package perCasa.esercizi_19_06_2023.esercizio2;

import javax.print.DocFlavor;

/*Esercizio su Builder:
Sviluppare un'applicazione java per creare automobili personalizzate.
Implementa un Builder per la creazione di automobili. L'automobile avrà diverse parti come "Motore", "Carrozzeria" e "Interni".
Utilizza il Builder per costruire un'automobile passo dopo passo, consentendo al cliente di personalizzare le parti desiderate.
*/
public class Automobile {

    private String motore;
    private String carrozzeria;
    private String interni;

    public Automobile(){}

    public Automobile(String motore, String carrozzeria, String interni) {
        this.motore = motore;
        this.carrozzeria = carrozzeria;
        this.interni = interni;
    }

    public String getMotore() {
        return motore;
    }

    public void setMotore(String motore) {
        this.motore = motore;
    }

    public String getCarrozzeria() {
        return carrozzeria;
    }

    public void setCarrozzeria(String carrozzeria) {
        this.carrozzeria = carrozzeria;
    }

    public String getInterni() {
        return interni;
    }

    public void setInterni(String interni) {
        this.interni = interni;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Motore: "+ motore+", ");
        sb.append("carrozzeria: "+ carrozzeria+", ");
        sb.append("interni: "+ interni+" ");
        return sb.toString();
    }
}
