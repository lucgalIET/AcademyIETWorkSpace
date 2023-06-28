package manuel.eserciziacasa.esercizicreationaldp.esercizio2;

public class AutomobileDirector {
    private AutomobileBuilder automobileBuilder;

    public AutomobileDirector(AutomobileBuilder automobileBuilder) {
        this.automobileBuilder = automobileBuilder;
    }

    public Automobile constructorAutomobile(){
        automobileBuilder.marcaAuto();
        automobileBuilder.modelloAuto();
        automobileBuilder.annoDiProduzioneAuto();
        return automobileBuilder.getAuto();
    }
}
