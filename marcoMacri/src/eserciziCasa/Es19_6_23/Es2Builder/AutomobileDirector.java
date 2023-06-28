package marcoMacri.src.eserciziCasa.Es19_6_23.Es2Builder;

public class AutomobileDirector {
    public AutomobileBuilder automobileBuilder;

    public AutomobileDirector(AutomobileBuilder automobileBuilder){this.automobileBuilder= automobileBuilder;}

    public Automobile costruisciAutomobile(){
        automobileBuilder.carrozzeriaAutomobile();
        automobileBuilder.interniAutomobile();
        automobileBuilder.motoreAutomobile();
        automobileBuilder.tappezzeriaAutomobile();
        return automobileBuilder.getAutomobile();
    }
}
