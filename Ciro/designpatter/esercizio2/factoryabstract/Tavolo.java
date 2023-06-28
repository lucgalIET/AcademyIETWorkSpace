package Ciro.designpatter.esercizio2.factoryabstract;

public class Tavolo implements Mobili {
    @Override
    public void assembla() {
        System.out.println("Ho assemblato il tavolo!");
    }
}