package perCasa.esercizi_19_06_2023.esercizio3;

public abstract class SpedizioneCreator {

    public abstract Spedizione creaSpedizione();

    public void spedisci(){
        Spedizione spedizione = creaSpedizione();
        spedizione.inTransito();
        spedizione.consegna();
    }
}
