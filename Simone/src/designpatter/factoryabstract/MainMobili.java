package designpatter.factoryabstract;
/*
Sviluppare un'applicazione java per la creazione di mobili.
Implementa un'Abstract Factory per la creazione di mobili in diversi stili, come "Moderno" e "Classico".
Ciascuno stile avrà i propri tipi di mobili come "Sedia", "Tavolo" e "Armadio". Utilizza l'Abstract Factory per creare istanze di mobili in base allo stile selezionato.
 */
public class MainMobili {
    public static void main(String[] args) {

        MobiliFactory tavoloFactory = new TavoloFactory();
        Mobili tavolo = tavoloFactory.creaMobile();
        tavolo.assembla();
    }
}

