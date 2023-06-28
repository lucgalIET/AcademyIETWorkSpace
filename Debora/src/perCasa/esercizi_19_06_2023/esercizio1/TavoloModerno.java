package perCasa.esercizi_19_06_2023.esercizio1;

public class TavoloModerno implements Mobili{
    @Override
    public void assembla() {
        System.out.println("Ho assemblato il tavolo in stile moderno");
    }

    @Override
    public String colore() {
        return "nero";
    }

    @Override
    public int numeroPezziPerAssemblaggio() {
        return 13;
    }
}
