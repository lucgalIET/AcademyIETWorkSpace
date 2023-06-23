package designpattern.factorymethod;

public class ConsegnaStandardCreator extends ConsegnaCreator {
    @Override
    public Consegna creaConsegna() {
        return new ConsegnaStandard();
    }
}
