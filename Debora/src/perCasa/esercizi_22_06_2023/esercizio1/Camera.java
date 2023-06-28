package perCasa.esercizi_22_06_2023.esercizio1;

/*Sviluppare un'applicazione per la creazione di un sistema di prenotazione di camere d'albergo.
Il sistema deve gestire diverse tipologie di camere come singole, doppie e suite, ognuna con caratteristiche specifiche come il numero di letti, la vista,
i servizi inclusi, ecc. */
public interface Camera {

    int numeroLetti();
    boolean lettoSingolo();
    String vista();
    boolean servizioInCamera();
    boolean servizioPulizia();
    boolean bagnoInCamera();
}
