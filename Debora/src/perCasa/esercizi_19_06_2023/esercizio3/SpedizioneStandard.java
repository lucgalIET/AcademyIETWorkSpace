package perCasa.esercizi_19_06_2023.esercizio3;

public class SpedizioneStandard implements Spedizione{
    @Override
    public void inTransito() {
        System.out.println("La spedizione è in transito, ma subirà dei ritardi");
    }

    @Override
    public void consegna() {
        System.out.println("La consegna è prevista per giorno 22 giugno 2023");
    }
}
