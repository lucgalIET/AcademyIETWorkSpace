package perCasa.esercizi_19_06_2023.esercizio1;

public class TavoloClassico implements Mobili{
    @Override
    public void assembla() {
        System.out.println("Ho assemblato il tavolo in stile classico");
    }

    @Override
    public String colore() {
        return "grigio";
    }

    @Override
    public int numeroPezziPerAssemblaggio() {
        return 12;
    }
}
