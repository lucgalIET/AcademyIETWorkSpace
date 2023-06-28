package perCasa.esercizi_19_06_2023.esercizio2;

public class AutomobileDiesel implements AutomobileBuilder{

    private Automobile automobile;

    public AutomobileDiesel(){
        this.automobile = new Automobile();
    }

    @Override
    public void motore() {
        automobile.setMotore("Motore diesel");
    }

    @Override
    public void carrozzeria() {
        automobile.setCarrozzeria("Carrozzeria in metallo");
    }

    @Override
    public void interni() {
        automobile.setInterni("Interni in pelle");
    }

    @Override
    public Automobile getAutomobile() {
        return automobile;
    }
}
