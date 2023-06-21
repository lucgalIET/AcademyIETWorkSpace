package manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobiliantichi;

import manuel.eserciziacasa.esercizicreationaldp.esercizio1.MobileFactory;

public interface MobileAnticoFactory extends MobileFactory<MobileAntico> {
    @Override
    MobileAntico creaMobile();
}
