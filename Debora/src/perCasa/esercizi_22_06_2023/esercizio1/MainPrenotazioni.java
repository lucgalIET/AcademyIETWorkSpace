package perCasa.esercizi_22_06_2023.esercizio1;

public class MainPrenotazioni {

    public static void main(String[] args) {
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.prenotaCameraSingola();
        System.out.println("------------------------------------------------\n");
        prenotazione.prenotaCameraDoppia();
        System.out.println("------------------------------------------------\n");
        prenotazione.prenotaSuite();
        System.out.println("------------------------------------------------\n");
        System.out.println("Numero stanze prenotate: "+ prenotazione.getNumerostanzePrenotate());
    }
}
