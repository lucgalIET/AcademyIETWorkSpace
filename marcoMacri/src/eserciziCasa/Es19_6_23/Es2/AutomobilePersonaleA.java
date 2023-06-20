package marcoMacri.src.eserciziCasa.Es19_6_23.Es2;
//Esercizio su Builder:
//        Sviluppare un'applicazione java per creare automobili personalizzate.
//        Implementa un Builder per la creazione di automobili. L'automobile avrà diverse parti come "Motore", "Carrozzeria" e "Interni".
//        Utilizza il Builder per costruire un'automobile passo dopo passo, consentendo al cliente di personalizzare le parti desiderate.

public class AutomobilePersonaleA implements AutomobileBuilder {
    private Automobile automobile;

    public AutomobilePersonaleA() {
        this.automobile = new Automobile();
    }

    @Override
    public void tappezzeriaAutomobile() {
        automobile.setTappezzeria("Tappezzeria A" );

    }

    @Override
    public void motoreAutomobile() {
        automobile.setMotore("1400 gas");

    }

    @Override
    public void carrozzeriaAutomobile() {
        automobile.setCarrozzeria("carrozzeria A");

    }

    @Override
    public void interniAutomobile() {
        automobile.setInterni("Interni A");

    }

    @Override
    public Automobile getAutomobile() {
        return automobile;
    }
}
