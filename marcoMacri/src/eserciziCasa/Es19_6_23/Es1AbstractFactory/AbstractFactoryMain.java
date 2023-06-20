package marcoMacri.src.eserciziCasa.Es19_6_23.Es1AbstractFactory;
//Esercizio su Abstract Factory:
//        Sviluppare un'applicazione java per la creazione di mobili.
//        Implementa un'Abstract Factory per la creazione di mobili in diversi stili, come "Moderno" e "Classico".
//        Ciascuno stile avrà i propri tipi di mobili come "Sedia", "Tavolo" e "Armadio". Utilizza l'Abstract Factory per creare istanze di mobili in base allo stile selezionato.
public class AbstractFactoryMain {
    public static void main(String[] args) {
        MobileClassicoFactory mobileClassicoFactory = new ArmadioFactory();
        MobileClassico armadio = mobileClassicoFactory.creaMobileClassico();
        armadio.stampaTipoClassico();

        MobileClassicoFactory mobileClassicoFactory1 = new SediaFactory();
        MobileClassico sedia = mobileClassicoFactory.creaMobileClassico();
        sedia.stampaTipoClassico();

        MobileClassicoFactory mobileClassicoFactory2 = new TavoloFactory();
        MobileClassico tavolo = mobileClassicoFactory.creaMobileClassico();
        tavolo.stampaTipoClassico();

        MobileModernoFactory mobileModernoFactory = new ArmadioFactory();
        MobileModerno armadio1 = mobileModernoFactory.creaMobileModerno();
        armadio1.stampaTipoModerno();

        MobileModernoFactory mobileModernoFactory1 = new SediaFactory();
        MobileModerno sedia1 = mobileModernoFactory1.creaMobileModerno();
        sedia1.stampaTipoModerno();

        MobileModernoFactory mobileModernoFactory2 = new TavoloFactory();
        MobileModerno tavolo1 = mobileModernoFactory.creaMobileModerno();
        tavolo1.stampaTipoModerno();
    }
}
