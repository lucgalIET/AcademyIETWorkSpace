package ListeRicorsive;
/*
Esercizio 1: Somma degli elementi di una lista ricorsiva

Implementa una funzione ricorsiva in Java che prenda in input una lista di interi
rappresentata come una lista ricorsiva di nodi
e restituisca la somma di tutti gli elementi nella lista.

 Testa la tua funzione utilizzando diverse liste di interi.
 */




public class es1Main {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);

        int somma= sommaNodi(nodo1);
        System.out.println(somma);


    }

    public static void stampaNodi(Nodo nodo){
        if(nodo == null) return;
        System.out.print(nodo.getValue()+" ");
        stampaNodi(nodo.getNodoSuccessivo());
    }

    public static int sommaNodi(Nodo nodo){
        if(nodo==null)return 0;

        return nodo.getValue()+sommaNodi(nodo.getNodoSuccessivo());

    }






}
