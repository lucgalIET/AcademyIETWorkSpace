package Ciro.designpatter.esercizio3.factorymethod;

public class ConsegnaStandard implements Consegna {
    @Override
    public void spedisci() {
        System.out.println("Hai scelto la consegna Standard");
    }
}