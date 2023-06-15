package eserciziPerCasa.ListeRicorsive.esercizio2;


/*
Verifica se una lista ricorsiva è ordinata in modo crescente
Implementa una funzione ricorsiva in Java che prenda in input una lista di numeri interi rappresentata come una lista ricorsiva
 di nodi e restituisca true se la lista è ordinata in modo crescente, altrimenti restituisca false.
 Testa la tua funzione utilizzando diverse liste di numeri.
 */
public class NodoMain {
    public static void main(String[] args) {

        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        Nodo nodo4 = new Nodo(4);
        Nodo nodo5 = new Nodo(5);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);

        System.out.println(verificaOrdinato(nodo1));
    }



    public static boolean verificaOrdinato(Nodo nodo){
        if(nodo.getNodoSuccessivo() == null) return true;

        if(nodo.getValue() <= nodo.getNodoSuccessivo().getValue())
            return verificaOrdinato(nodo.getNodoSuccessivo());
        else
            return false;

    }
}