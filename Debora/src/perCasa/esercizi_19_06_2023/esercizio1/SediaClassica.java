package perCasa.esercizi_19_06_2023.esercizio1;

public class SediaClassica implements Mobili{
    @Override
    public void assembla() {
        System.out.println("Ho assemblato la sedia in stile classico");
    }

    @Override
    public String colore() {
        return "marrone";
    }

    @Override
    public int numeroPezziPerAssemblaggio() {
        return 10;
    }
}
