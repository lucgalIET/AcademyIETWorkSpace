package designpattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class LoggerSingleton {

    private static LoggerSingleton instance;

    private static List<String> listaEventi = new ArrayList<>();

    private LoggerSingleton(){

    }

    public static LoggerSingleton getInstance(){
        if(instance == null){
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void aggiungiEvento(String evento){
        listaEventi.add(evento);
        System.out.println("L'evento è stato aggiunto!");
    }

    public List<String> getListaEventi(){
        return listaEventi;
    }


}