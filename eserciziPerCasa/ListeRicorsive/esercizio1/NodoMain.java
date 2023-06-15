package eserciziPerCasa.ListeRicorsive.esercizio1;
/*
Somma degli elementi di una lista ricorsiva
Implementa una funzione ricorsiva in Java che prenda in input una lista di interi rappresentata come una lista ricorsiva di nodi
 e restituisca la somma di tutti gli elementi nella lista. Testa la tua funzione utilizzando diverse liste di interi.
 */

public class NodoMain {

    public static void main(String[] args) {
       Nodo nodo1 = new Nodo(10);
       Nodo nodo2 = new Nodo(20);
       Nodo nodo3 = new Nodo(30);
       Nodo nodo4 = new Nodo(40);
       Nodo nodo5 = new Nodo(50);
       nodo1.setNext(nodo2);
       nodo2.setNext(nodo3);
       nodo3.setNext(nodo4);
       nodo4.setNext(nodo5);

       stampaNodi(nodo1);
       System.out.println();
       System.out.println("La somma degli elementi della lista è " + sommaLista(nodo1));


    }


    public static void stampaNodi(Nodo nodo){
        if(nodo == null) return;
        System.out.print(nodo.getValue()+" ");
        stampaNodi(nodo.getNext());
    }


    public static int sommaLista(Nodo nodo){

        if(nodo == null) return 0;

        return nodo.getValue() + sommaLista(nodo.getNext());
    }



}
