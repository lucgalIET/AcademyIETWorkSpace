package perCasa.esercizi_19_06_2023.esercizio3;

public class SpedizioneExpress implements Spedizione{
    @Override
    public void inTransito() {
        System.out.println("La spedizione è in transito");
    }

    @Override
    public void consegna() {
        System.out.println("Il corriere ha effettuato la consegna");
    }
}
