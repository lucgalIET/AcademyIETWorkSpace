package Ciro.designpatter.esercizio2.factoryabstract;

public class SediaFactory implements MobiliFactory{
    @Override
    public Mobili creaMobile() {
        return new Sedia();
    }
}