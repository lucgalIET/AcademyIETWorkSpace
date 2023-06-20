package perCasa.esercizi_19_06_2023.esercizio1;

public class MainNegozioMobili {

    public static void main(String[] args) {

        MobileModernoFactory tavoloModerno = new TavoloModernoFactory();
        Mobili tavoloMod = tavoloModerno.creaMobileModerno();
        MobileModernoFactory sediaModerna = new SediaModernaFactory();
        Mobili sediaMod = sediaModerna.creaMobileModerno();
        MobileModernoFactory armadioModerno = new ArmadioModernoFactory();
        Mobili armadioMod = armadioModerno.creaMobileModerno();

        MobileClassicoFactory tavoloClassico = new TavoloClassicoFactory();
        Mobili tavoloCla = tavoloClassico.creaMobileClassico();
        MobileClassicoFactory sediaClassica = new SediaClassicaFactory();
        Mobili sediaCla = sediaClassica.creaMobileClassico();
        MobileClassicoFactory armadioClassico = new ArmadioClassicoFactory();
        Mobili armadioCla = armadioClassico.creaMobileClassico();

        System.out.println("Tavolo Moderno: \n");
        tavoloMod.assembla();
        System.out.println("Colore: "+tavoloMod.colore());
        System.out.println("Numero pezzi assemblaggio: "+tavoloMod.numeroPezziPerAssemblaggio());
        System.out.println("\n");
        System.out.println("Tavolo Classico: \n");
        tavoloCla.assembla();
        System.out.println("Colore: "+tavoloCla.colore());
        System.out.println("Numero pezzi assemblaggio: "+tavoloCla.numeroPezziPerAssemblaggio());
        System.out.println("\n");
        System.out.println("Armadio Moderno: \n");
        armadioMod.assembla();
        System.out.println("Colore: "+armadioMod.colore());
        System.out.println("Numero pezzi assemblaggio: "+armadioMod.numeroPezziPerAssemblaggio());
        System.out.println("\n");
        System.out.println("Armadio Classico: \n");
        armadioCla.assembla();
        System.out.println("Colore: "+armadioCla.colore());
        System.out.println("Numero pezzi assemblaggio: "+armadioCla.numeroPezziPerAssemblaggio());
        System.out.println("\n");
        System.out.println("Sedia Moderna: \n");
        sediaMod.assembla();
        System.out.println("Colore: "+sediaMod.colore());
        System.out.println("Numero pezzi assemblaggio: "+sediaMod.numeroPezziPerAssemblaggio());
        System.out.println("\n");
        System.out.println("Sedia Classica: \n");
        sediaCla.assembla();
        System.out.println("Colore: "+sediaCla.colore());
        System.out.println("Numero pezzi assemblaggio: "+sediaCla.numeroPezziPerAssemblaggio());


    }
}
