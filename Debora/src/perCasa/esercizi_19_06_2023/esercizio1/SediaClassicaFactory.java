package perCasa.esercizi_19_06_2023.esercizio1;

public class SediaClassicaFactory implements MobileClassicoFactory{
    @Override
    public Mobili creaMobileClassico() {
        return new SediaClassica();
    }
}
