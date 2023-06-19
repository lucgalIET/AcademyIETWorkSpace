package designpatter.factorymethod;

public class ConsegnaExpressCreator extends ConsegnaCreator {
    @Override
    public Consegna creaConsegna() {
        return new ConsegnaExpress();
    }
}
