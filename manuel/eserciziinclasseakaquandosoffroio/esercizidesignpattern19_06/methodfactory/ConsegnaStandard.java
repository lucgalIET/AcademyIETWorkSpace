package manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory;

import manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory.Consegna;

public class ConsegnaStandard implements Consegna {
    @Override
    public void spedisci() {
        System.out.println("Consegna lenta poste italiane");
    }
}
