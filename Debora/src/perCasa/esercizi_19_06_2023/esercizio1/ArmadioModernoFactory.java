package perCasa.esercizi_19_06_2023.esercizio1;

public class ArmadioModernoFactory implements MobileModernoFactory{
    @Override
    public Mobili creaMobileModerno() {
        return new ArmadioModerno();
    }
}
