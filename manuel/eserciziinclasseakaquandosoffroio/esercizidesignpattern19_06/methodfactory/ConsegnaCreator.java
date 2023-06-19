package manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory;

import manuel.eserciziinclasseakaquandosoffroio.esercizidesignpattern19_06.methodfactory.Consegna;

public abstract class ConsegnaCreator {
    public abstract Consegna creaConsegna();

    public void gestioneConsegne(){
        Consegna consegna = creaConsegna();
        consegna.spedisci();
    }
}
