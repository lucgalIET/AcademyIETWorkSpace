package inClasse.abstractfactory;

public class SediaFactory implements MobiliFactory{
    @Override
    public Mobili creaMobile() {
        return new Sedia();
    }
}
