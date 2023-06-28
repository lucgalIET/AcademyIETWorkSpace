package perCasa.esercizi_19_06_2023.esercizio2;

public class MainConcessionario {

    public static void main(String[] args) {
        AutomobileBuilder automobileBuilder = new AutomobileDiesel();
        AutomobileDirector automobileDirector = new AutomobileDirector(automobileBuilder);

        Automobile ferrari = automobileDirector.costructorAutomobile();
        System.out.println(ferrari);
    }
}
