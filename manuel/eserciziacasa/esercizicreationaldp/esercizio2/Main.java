package manuel.eserciziacasa.esercizicreationaldp.esercizio2;

public class Main {
    public static void main(String[] args) {
        AutomobileBuilder automobileBuilder = new AutomobileCustom();
        AutomobileDirector automobileDirector = new AutomobileDirector(automobileBuilder);

        Automobile fiesta = automobileDirector.constructorAutomobile();
        System.out.println(fiesta);
    }
}
