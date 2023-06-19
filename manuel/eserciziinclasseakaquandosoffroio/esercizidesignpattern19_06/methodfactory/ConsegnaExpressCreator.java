package manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory;

import manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory.Consegna;
import manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory.ConsegnaCreator;
import manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory.ConsegnaExpress;

public class ConsegnaExpressCreator extends ConsegnaCreator {
    @Override
    public Consegna creaConsegna() {
        return new ConsegnaExpress();
    }
}
