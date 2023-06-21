package manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobilimoderni;

import manuel.eserciziacasa.esercizicreationaldp.esercizio1.MobileFactory;
import manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobilimoderni.MobileModerno;

public interface MobileModernoFactory extends MobileFactory<MobileModerno> {
    @Override
    MobileModerno creaMobile();
}
