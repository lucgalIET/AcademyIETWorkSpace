package marcoMacri.src.eserciziCasa.Es19_6_23.Es1AbstractFactory;

public class ArmadioFactory implements MobileModernoFactory,MobileClassicoFactory {
    @Override
    public MobileClassico creaMobileClassico() {
        return new Armadio();
    }

    @Override
    public MobileModerno creaMobileModerno() {
        return new Armadio();
    }
}
