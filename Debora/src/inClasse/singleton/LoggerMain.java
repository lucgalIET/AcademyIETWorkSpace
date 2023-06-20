package inClasse.singleton;

public class LoggerMain {

    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        log.aggiungiEvento("Sono il primo evento");
        System.out.println(log.getListaEventi());

        Logger log1 = Logger.getInstance();
        log1.aggiungiEvento("Sono il secondo evento");
        System.out.println(log1.getListaEventi());
    }
}
