package perCasa.esercizi_19_06_2023.esercizio2;

public class AutomobileDirector {

    public AutomobileBuilder automobileBuilder;

    public AutomobileDirector(AutomobileBuilder automobileBuilder){
        this.automobileBuilder = automobileBuilder;
    }

    public Automobile costructorAutomobile(){
        automobileBuilder.motore();
        automobileBuilder.carrozzeria();
        automobileBuilder.interni();
        return automobileBuilder.getAutomobile();
    }
}
