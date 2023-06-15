package esercizi.src.eserciziCasa.Es14_6_23;
//Esercizio 1: Somma degli elementi di una lista ricorsiva
//        Implementa una funzione ricorsiva in Java che prenda in input una lista di interi rappresentata come una lista ricorsiva di nodi
//        e restituisca la somma di tutti gli elementi nella lista. Testa la tua funzione utilizzando diverse liste di interi.
//
public class Es1 {
    public static void main(String[] args) {
       Nodo nodo1 = new Nodo<Integer>(1);
       Nodo nodo2 = new Nodo<Integer>(4);

       Nodo nodo3 = new Nodo<Integer>(5);

       Nodo nodo4 = new Nodo<Integer>(6);
       Nodo nodo5 = new Nodo<Integer>(6);
        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);
        nodo5.setNodoSuccessivo(null);
        System.out.println("La somma dei valori contenuti nei nodi è: "+ sommaElementiListaNodo(nodo1));
    }

    public static int sommaElementiListaNodo(Nodo<Integer> nodo){
        if(nodo==null)return 0;
        int somma = nodo.getValore();
        return somma + sommaElementiListaNodo(nodo.getNodoSuccessivo());
    }
}
