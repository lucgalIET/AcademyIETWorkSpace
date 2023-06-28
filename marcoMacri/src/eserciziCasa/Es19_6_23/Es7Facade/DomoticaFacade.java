package marcoMacri.src.eserciziCasa.Es19_6_23.Es7Facade;
//Esercizio su Façade:
//
//        Sviluppare un'applicazione in java per il controllo e la gestione di un sistema domotico.
//        Implementa il pattern Façade per fornire un'interfaccia semplificata per l'interazione con il sistema domotico.
//        La Façade dovrebbe raggruppare diverse funzionalità e servizi del sistema, fornendo metodi di alto livello
//        per accendere e spegnere le luci, regolare la temperatura, aprire e chiudere le porte, senza dover conoscere i dettagli di implementazione specifici di ogni componente del sistema.
public class DomoticaFacade {
    private Luci luci;
    private Temperatura temperatura;
    private Porte porte;

    public DomoticaFacade() {
        this.luci = new Luci();
        this.temperatura = new Temperatura();
        this.porte = new Porte();
    }

    public DomoticaFacade(Luci luci, Temperatura temperatura, Porte porte) {
        this.luci = luci;
        this.temperatura = temperatura;
        this.porte = porte;
    }

    public void ritornoACasa() {
        luci.accendi();
        temperatura.alzaTemperatura();
        porte.chiudiPorte();
    }

    public void escoDaCasa() {
        luci.spegni();
        temperatura.abbassaTemperatura();
        porte.apriPorte();
        porte.chiudiPorte();
    }


}