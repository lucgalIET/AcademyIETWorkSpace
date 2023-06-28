package perCasa.esercizi_19_06_2023.esercizio1;

public class ArmadioModerno implements Mobili{
    @Override
    public void assembla() {
        System.out.println("Ho assemblato l'armadio in stile moderno");
    }

    @Override
    public String colore() {
        return "giallo";
    }

    @Override
    public int numeroPezziPerAssemblaggio() {
        return 8;
    }
}
