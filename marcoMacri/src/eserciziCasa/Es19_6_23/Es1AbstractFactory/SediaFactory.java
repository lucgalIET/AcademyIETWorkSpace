package marcoMacri.src.eserciziCasa.Es19_6_23.Es1AbstractFactory;

public class SediaFactory implements MobileModernoFactory,MobileClassicoFactory{
    @Override
    public MobileClassico creaMobileClassico() {
        return new Sedia();
    }

    @Override
    public MobileModerno creaMobileModerno() {
        return new Sedia();
    }
}
