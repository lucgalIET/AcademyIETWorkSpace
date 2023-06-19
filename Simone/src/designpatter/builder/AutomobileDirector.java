package designpatter.builder;


public class AutomobileDirector  {
    private AutomobileBuilder automobileBuilder;

    public AutomobileDirector(AutomobileBuilder automobileBuilder) {
        this.automobileBuilder=automobileBuilder;
    }

    public Automobile constructorAutomobile(){
        automobileBuilder.motoreAutomobile();
        automobileBuilder.carrozzeriaAutomobile();
        automobileBuilder.interniAutomobile();
        return automobileBuilder.getAutomobile();
    }


}
