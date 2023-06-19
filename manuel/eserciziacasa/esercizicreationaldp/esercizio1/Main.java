package manuel.eserciziacasa.esercizicreationaldp.esercizio1;

import manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobiliantichi.MobileAntico;
import manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobiliantichi.MobileAnticoFactory;
import manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobiliantichi.TavoloAnticoFactory;
import manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobilimoderni.*;

public class Main {
    public static void main(String[] args) {
        MobileModernoFactory mobileModernoFactory = new SediaModernaFactory();
        MobileModerno sediaModerna = mobileModernoFactory.creaMobile();
        mobileModernoFactory = new TavoloModernoFactory();
        MobileModerno tavoloModerno = mobileModernoFactory.creaMobile();
        mobileModernoFactory = new DivanoModernoFactory();
        MobileModerno divanoModerno = mobileModernoFactory.creaMobile();

        MobileAnticoFactory mobileAnticoFactory = new TavoloAnticoFactory();
        MobileAntico tavoloAntico = mobileAnticoFactory.creaMobile();

        sediaModerna.descrizione();
        tavoloModerno.descrizione();
        divanoModerno.descrizione();
        tavoloAntico.descrizione();
    }
}
