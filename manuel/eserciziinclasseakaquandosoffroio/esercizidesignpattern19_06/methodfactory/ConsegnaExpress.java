package manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory;

import manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory.Consegna;

public class ConsegnaExpress implements Consegna {
    @Override
    public void spedisci() {
        System.out.println("Consegna velocissima express");
    }
}
