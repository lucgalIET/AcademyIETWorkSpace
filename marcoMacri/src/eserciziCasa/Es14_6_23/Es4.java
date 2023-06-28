//package marcoMacri.src.eserciziCasa.Es14_6_23;
//
////Esercizio 4: Concatenazione delle stringhe in una lista ricorsiva
////        Scrivi una funzione ricorsiva in Java che prenda in input una lista di nodi, dove ogni nodo contiene una stringa,
////        e restituisca la concatenazione di tutte le stringhe presenti nella lista. La funzione dovrà restituire una singola
////        stringa che rappresenta la concatenazione delle stringhe dei nodi successivi nella lista.
//public class Es4 {
//    static StringBuilder sb = new StringBuilder();
//    public static void main(String[] args) {
//        Nodo<String> nodo1 = new Nodo<>("ciao");
//        Nodo<String> nodo2 = new Nodo<>("come");
//
//        Nodo<String> nodo3 = new Nodo<>("stai");
//
//        Nodo<String> nodo4 = new Nodo<>("tutto");
//        Nodo<String> nodo5 = new Nodo<>("bene?");
//        nodo1.setNodoSuccessivo(nodo2);
//        nodo2.setNodoSuccessivo(nodo3);
//        nodo3.setNodoSuccessivo(nodo4);
//        nodo4.setNodoSuccessivo(nodo5);
//        nodo5.setNodoSuccessivo(null);
//        System.out.println("La somma delle stringhe contenute nei nodi è: "+ sommaElementiListaNodo(nodo1));
//    }
//    public static String sommaElementiListaNodo(Nodo<String> nodo){
//        if(nodo==null)return sb.toString();
//        sb.append(nodo.getValore()).append(" ");
//        return sommaElementiListaNodo(nodo.getNodoSuccessivo());
//    }
//}
