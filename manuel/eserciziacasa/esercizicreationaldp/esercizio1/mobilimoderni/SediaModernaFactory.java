package manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobilimoderni;

import manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobilimoderni.MobileModerno;
import manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobilimoderni.MobileModernoFactory;
import manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobilimoderni.SediaModerna;

public class SediaModernaFactory implements MobileModernoFactory {
    @Override
    public MobileModerno creaMobile() {
        return new SediaModerna();
    }
}
