package designpatter.factoryabstract;

public class SediaFactory implements MobiliFactory{
    @Override
    public Mobili creaMobile() {
        return new Sedia();
    }
}