package Ciro.designpatter.esercizio3.factorymethod;

public class ConsegnaStandardCreator extends ConsegnaCreator {
    @Override
    public Consegna creaConsegna() {
        return new ConsegnaStandard();
    }
}
