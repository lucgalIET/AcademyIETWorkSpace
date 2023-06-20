package Ciro.designpatter.esercizio1.builder;


public interface AutomobileBuilder {
    void motoreAutomobile();
    void carrozzeriaAutomobile();
    void interniAutomobile();
    Automobile getAutomobile();
}
