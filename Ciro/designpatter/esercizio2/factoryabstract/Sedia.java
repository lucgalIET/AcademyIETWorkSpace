package Ciro.designpatter.esercizio2.factoryabstract;

public class Sedia implements Mobili{
    @Override
    public void assembla() {
        System.out.println("Ho assemblato la sedia!");
    }
}