package Ciro.designpatter.esercizio2.factoryabstract;

public class TavoloFactory implements MobiliFactory{

    @Override
    public Mobili creaMobile() {
        return new Tavolo();
    }
}