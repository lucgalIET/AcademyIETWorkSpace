package perCasa.Esercizi_14_06_2023;


//Esercizio 1: Somma degli elementi di una lista ricorsiva
//Implementa una funzione ricorsiva in Java che prenda in input una lista di interi rappresentata come una lista ricorsiva di nodi
//e restituisca la somma di tutti gli elementi nella lista. Testa la tua funzione utilizzando diverse liste di interi.

public class Esercizio1 {

    public static void main(String[] args) {
        Nodo<Integer> nodo1 = new Nodo<>(5);
        Nodo<Integer> nodo2 = new Nodo<>(11);
        Nodo<Integer> nodo3 = new Nodo<>(8);
        Nodo<Integer> nodo4 = new Nodo<>(15);
        Nodo<Integer> nodo5 = new Nodo<>(3);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);

        System.out.println("La somma di tutti i nodi è: "+ sommaNodi(nodo1));

    }

    public static int sommaNodi(Nodo<Integer> nodo){
        if(nodo == null) return 0;
        return nodo.getValore() + sommaNodi(nodo.getNodoSuccessivo());
    }


}
