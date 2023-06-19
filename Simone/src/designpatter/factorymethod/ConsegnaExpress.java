package designpatter.factorymethod;

public class ConsegnaExpress implements Consegna {
    @Override
    public void spedisci() {
        System.out.println("Hai scelto la consegna Express");
    }
}
