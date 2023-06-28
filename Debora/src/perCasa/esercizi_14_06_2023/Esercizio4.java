package perCasa.esercizi_14_06_2023;

//Esercizio 4: Concatenazione delle stringhe in una lista ricorsiva
//Scrivi una funzione ricorsiva in Java che prenda in input una lista di nodi, dove ogni nodo contiene una stringa,
//e restituisca la concatenazione di tutte le stringhe presenti nella lista. La funzione dovrà restituire una singola
//stringa che rappresenta la concatenazione delle stringhe dei nodi successivi nella lista.
public class Esercizio4 {

    public static void main(String[] args) {
        Nodo<String> nodo1 = new Nodo<>("ciao");
        Nodo<String> nodo2 = new Nodo<>("come");
        Nodo<String> nodo3 = new Nodo<>("stai");
        Nodo<String> nodo4 = new Nodo<>("io");
        Nodo<String> nodo5 = new Nodo<>("bene");

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);

        System.out.println(concatenaStringhe(nodo1));

    }

    public static String concatenaStringhe(Nodo<String> nodo){
        if(nodo == null) return "";
        return nodo.getValore() + concatenaStringhe(nodo.getNodoSuccessivo());
    }
}
