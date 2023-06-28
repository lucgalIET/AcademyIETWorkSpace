package Ciro.designpatter.esercizio3.factorymethod;

public class ConsegnaExpressCreator extends ConsegnaCreator {
    @Override
    public Consegna creaConsegna() {
        return new ConsegnaExpress();
    }
}
