package perCasa.esercizi_19_06_2023.esercizio1;

public class SediaModernaFactory implements MobileModernoFactory{

    @Override
    public Mobili creaMobileModerno() {
        return new SediaModerna();
    }
}
