package marcoMacri.src.eserciziCasa.Es19_6_23.Es1AbstractFactory;

public class TavoloFactory implements MobileModernoFactory,MobileClassicoFactory{
    @Override
    public MobileClassico creaMobileClassico() {
        return new Tavolo();
    }

    @Override
    public MobileModerno creaMobileModerno() {
        return new Tavolo();
    }
}
