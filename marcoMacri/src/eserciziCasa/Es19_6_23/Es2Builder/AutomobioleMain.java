package marcoMacri.src.eserciziCasa.Es19_6_23.Es2Builder;

public class AutomobioleMain {
    AutomobileBuilder automobileBuilder = new AutomobilePersonaleA(); //Tipo dell'automobile
    AutomobileDirector automobileDirector= new AutomobileDirector (automobileBuilder);
    Automobile automobileA = automobileDirector.costruisciAutomobile();
}
