package perCasa.esercizi_19_06_2023.esercizio3;

public class MainConsegne {

    public static void main(String[] args) {
        SpedizioneCreator spedizioneExCreator = new SpedizioneExpressCreator();
        spedizioneExCreator.spedisci();
        System.out.println("\n");
        Spedizione spedizioneEx = spedizioneExCreator.creaSpedizione();
        System.out.println("Spedizione Express: \n");
        spedizioneEx.inTransito();
        spedizioneEx.consegna();

        System.out.println("\n");

        System.out.println("Spedizione Standard: \n");
        SpedizioneCreator spedizioneStCreator = new SpedizioneStandardCreator();
        Spedizione spedizioneSt = spedizioneStCreator.creaSpedizione();
        spedizioneSt.inTransito();
        spedizioneSt.consegna();
    }
}
