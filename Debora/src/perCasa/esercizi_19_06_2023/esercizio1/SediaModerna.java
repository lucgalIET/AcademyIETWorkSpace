package perCasa.esercizi_19_06_2023.esercizio1;

public class SediaModerna implements Mobili{
    @Override
    public void assembla() {
        System.out.println("Ho assemblato la sedia in stile moderno");
    }

    @Override
    public String colore() {
        return "bianca";
    }

    @Override
    public int numeroPezziPerAssemblaggio() {
        return 10;
    }
}
