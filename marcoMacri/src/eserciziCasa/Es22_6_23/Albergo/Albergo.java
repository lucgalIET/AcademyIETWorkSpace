package marcoMacri.src.eserciziCasa.Es22_6_23.Albergo;
//Esercizio:
//        Sviluppare un'applicazione per la creazione di un sistema di prenotazione di camere d'albergo.
//        Il sistema deve gestire diverse tipologie di camere come singole, doppie e suite, ognuna con caratteristiche specifiche come il numero di letti, la vista,
//        i servizi inclusi, ecc.
public class Albergo {
    private String numeroCamera;
    private String tipoCamera;
    private int prezzo;

    public Albergo() {
    }

    public Albergo(String ingredienti, String nome, int prezzo) {
        this.numeroCamera = ingredienti;
        this.tipoCamera = nome;
        this.prezzo = prezzo;
    }

    public String getNumeroCamera() {
        return numeroCamera;
    }

    public void setNumeroCamera(String numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    public String getTipoCamera() {
        return tipoCamera;
    }

    public void setTipoCamera(String tipoCamera) {
        this.tipoCamera = tipoCamera;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Pizza{" + "ingredienti='" + numeroCamera + '\'' + ", nome='" + tipoCamera + '\'' + ", prezzo=" + prezzo + '}';
    }
}