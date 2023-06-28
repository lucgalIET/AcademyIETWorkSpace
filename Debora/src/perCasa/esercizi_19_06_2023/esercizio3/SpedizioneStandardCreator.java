package perCasa.esercizi_19_06_2023.esercizio3;

public class SpedizioneStandardCreator extends SpedizioneCreator{
    @Override
    public Spedizione creaSpedizione() {
        return new SpedizioneStandard();
    }
}
