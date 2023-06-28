package perCasa.esercizi_19_06_2023.esercizio1;

public class ArmadioClassico implements Mobili{
    @Override
    public void assembla() {
        System.out.println("Ho assemblato l'armadio in stile classico");
    }

    @Override
    public String colore() {
        return "arancione";
    }

    @Override
    public int numeroPezziPerAssemblaggio() {
        return 6;
    }
}
