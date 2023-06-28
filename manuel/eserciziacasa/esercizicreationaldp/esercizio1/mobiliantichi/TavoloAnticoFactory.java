package manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobiliantichi;

public class TavoloAnticoFactory implements MobileAnticoFactory {
    @Override
    public MobileAntico creaMobile() {
        return new TavoloAntico();
    }
}
