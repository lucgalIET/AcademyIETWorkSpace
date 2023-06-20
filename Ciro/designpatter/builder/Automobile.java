package Ciro.designpatter.builder;
/*

Sviluppare un'applicazione per creare automobili personalizzate. Implementa un Builder per la creazione di automobili.
 L'automobile avrà diverse parti come "Motore",
 "Carrozzeria" e "Interni". Utilizza il Builder per costruire un'automobile passo dopo passo, consentendo al cliente di personalizzare le parti desiderate.
 */
public class Automobile {
    private String motore;
    private String carrozzeria;
    private String interni;

    public Automobile() {
    }

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

    @Override
    public String toString() {
        return "Automobile{motore: " + motore +", carrozzeria: " + carrozzeria  + ", interni: " + interni + '}';
    }
}
