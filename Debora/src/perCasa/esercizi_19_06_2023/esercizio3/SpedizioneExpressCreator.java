package perCasa.esercizi_19_06_2023.esercizio3;

public class SpedizioneExpressCreator extends SpedizioneCreator{
    @Override
    public Spedizione creaSpedizione() {
        return new SpedizioneExpress();
    }
}
