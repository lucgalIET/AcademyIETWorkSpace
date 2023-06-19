package designpatter.builder;

/*
Esercizio su Builder:

Sviluppare un'applicazione per creare automobili personalizzate. Implementa un Builder per la creazione di automobili.
 L'automobile avrà diverse parti come "Motore",
 "Carrozzeria" e "Interni". Utilizza il Builder per costruire un'automobile passo dopo passo, consentendo al cliente di personalizzare le parti desiderate.
 */
public class Main {
    public static void main(String[] args) {
        AutomobileBuilder automobileBuilder=new Audi();
        AutomobileDirector automobileDirector=new AutomobileDirector(automobileBuilder);

        Automobile audi= automobileDirector.constructorAutomobile();
        System.out.println(audi);
    }
}
