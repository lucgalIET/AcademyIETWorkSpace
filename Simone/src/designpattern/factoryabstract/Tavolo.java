package designpattern.factoryabstract;

public class Tavolo implements Mobili {
    @Override
    public void assembla() {
        System.out.println("Ho assemblato il tavolo!");
    }
}