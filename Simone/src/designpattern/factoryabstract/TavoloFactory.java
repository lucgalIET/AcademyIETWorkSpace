package designpattern.factoryabstract;

public class TavoloFactory implements MobiliFactory{

    @Override
    public Mobili creaMobile() {
        return new Tavolo();
    }
}