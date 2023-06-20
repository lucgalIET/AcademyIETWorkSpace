package perCasa.esercizi_19_06_2023.esercizio1;

public class ArmadioClassicoFactory implements MobileClassicoFactory{
    @Override
    public Mobili creaMobileClassico() {
        return new ArmadioClassico();
    }
}
