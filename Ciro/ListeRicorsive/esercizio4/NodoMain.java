package Ciro.ListeRicorsive.esercizio4;
/*
Concatenazione delle stringhe in una lista ricorsiva
Scrivi una funzione ricorsiva in Java che prenda in input una lista di nodi, dove ogni nodo contiene una stringa,
e restituisca la concatenazione di tutte le stringhe presenti nella lista. La funzione dovrà restituire una singola
stringa che rappresenta la concatenazione delle stringhe dei nodi successivi nella lista.
*/

public class NodoMain {
    public static void main(String[] args) {

        Nodo<String> nodo1=new Nodo<>("Buongiorno");
        Nodo<String> nodo2=new Nodo<>("mondo");
        Nodo<String> nodo3=new Nodo<>("crudele!");

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);

        System.out.println(concatenazioneString(nodo1));
    }

    public static String concatenazioneString(Nodo<String> nodo){
        if(nodo == null) return" ";

        String concat = nodo.getValore() + " " + concatenazioneString(nodo.getNodoSuccessivo());

        return concat;
    }
}

