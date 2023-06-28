package manuel.eserciziacasa.esercizicreationaldp.esercizio2;

public class AutomobileCustom implements AutomobileBuilder{

    private Automobile automobile;

    public AutomobileCustom() {
        this.automobile = new Automobile();
    }

    @Override
    public void marcaAuto() {
        automobile.setMarca("Ford"); //Da sostituire con scanner
    }

    @Override
    public void modelloAuto() {
        automobile.setModello("Fiesta"); //Da sostituire con scanner
    }

    @Override
    public void annoDiProduzioneAuto() {
        automobile.setAnnoDiProduzione(2006); //Da sostituire con scanner
    }

    @Override
    public Automobile getAuto(){
        return automobile;
    }
}
