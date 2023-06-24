package Ciro.designpatter.albergo;

import java.util.ArrayList;
import java.util.List;

public class Prenotazione {

    private List<Camera> listaCamerePrenotate = new ArrayList<>();

    public Prenotazione(){}

    public void prenotaCameraSingola(){
        CameraSingolaCreator cameraSingolaCreator = new CameraSingolaCreator();
        Camera cameraSingola = cameraSingolaCreator.creaCamera();
        System.out.println("---------------------------------------------------------");
        System.out.println("Hai prenotato una camera singola con i seguenti servizi: ");
        System.out.println("Numero letti: " + cameraSingola.numeroLetti());
        System.out.println("Letto singolo " + (cameraSingola.lettoSingolo()? " Si" : " No"));
        System.out.println("Vista? " + cameraSingola.vista());
        System.out.println("Servizio in camera incluso " + (cameraSingola.servizioInCamera()? " Si" : " No"));
        System.out.println("Servizio pulizia incluso " + (cameraSingola.servizioPulizia()? " Si" : " No"));
        System.out.println("Bagno in camera " + (cameraSingola.bagnoInCamera()? " Si" : " No" ));
        System.out.println("Animali ammessi " + (cameraSingola.animaliAmmessi() ? "Si" : " No"));
        System.out.println("---------------------------------------------------------");
        listaCamerePrenotate.add(cameraSingola);
    }

    public void prenotaCameraDoppia(){
        CameraDoppiaCreator cameraDoppiaCreator = new CameraDoppiaCreator();
        Camera cameraDoppia = cameraDoppiaCreator.creaCamera();
        System.out.println("---------------------------------------------------------");
        System.out.println("Hai prenotato una camera doppia con i seguenti servizi: ");
        System.out.println("Numero letti: " + cameraDoppia.numeroLetti());
        System.out.println("Letto singolo " + (cameraDoppia.lettoSingolo()? " Si" : " No"));
        System.out.println("Vista "+ cameraDoppia.vista());
        System.out.println("Servizio in camera incluso " + (cameraDoppia.servizioInCamera()? " Si" : " No"));
        System.out.println("Servizio pulizia incluso "+ (cameraDoppia.servizioPulizia()? " Si" : " No"));
        System.out.println("Bagno in camera " + (cameraDoppia.bagnoInCamera()?"  Si" : " No" ));
        System.out.println("Animali ammessi " + (cameraDoppia.animaliAmmessi() ? "Si" : " No"));
        System.out.println("---------------------------------------------------------");
        listaCamerePrenotate.add(cameraDoppia);
    }

    public void prenotaSuite(){
        SuiteCreator suiteCreator = new SuiteCreator();
        Camera suite = suiteCreator.creaCamera();
        System.out.println("---------------------------------------------------------");
        System.out.println("Hai prenotato una suite con i seguenti servizi: ");
        System.out.println("Numero letti: " + suite.numeroLetti());
        System.out.println("Letto singolo " + (suite.lettoSingolo()? " Si" : " No"));
        System.out.println("Vista "+ suite.vista());
        System.out.println("Servizio in camera incluso "+(suite.servizioInCamera()? " Si" : " No"));
        System.out.println("Servizio pulizia incluso "+ (suite.servizioPulizia()? " Si" : " No"));
        System.out.println("Bagno in camera "+(suite.bagnoInCamera()? " Si" : " No" ));
        System.out.println("Animali ammessi " +(suite.animaliAmmessi() ? "Si" : " No"));
        System.out.println("---------------------------------------------------------");
        listaCamerePrenotate.add(suite);
    }

    public int getNumerostanzePrenotate(){
        return listaCamerePrenotate.size();
    }

}
