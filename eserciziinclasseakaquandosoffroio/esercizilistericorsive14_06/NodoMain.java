package eserciziinclasseakaquandosoffroio.esercizilistericorsive14_06;

import eserciziinclasseakaquandosoffroio.esercizilistericorsive14_06.Nodo;

public class NodoMain {
    //Implementa una funzione ricorsiva in Java che prenda in
    // input una lista di elementi e restituisca una nuova lista con gli elementi invertiti rispetto all'originale.
    public static void main(String[] args) {
        Nodo<Integer> nodo1 = new Nodo<>(1);
        Nodo<Integer> nodo2 = new Nodo<>(2);
        Nodo<Integer> nodo3 = new Nodo<>(3);
        Nodo<Integer> nodo4 = new Nodo<>(4);
        Nodo<Integer> nodo5 = new Nodo<>(5);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);
//
        stampaNodi(nodo1);
        System.out.println();
//        invertitore(nodo1);
        stampaNodi(invertitore(nodo1));
    }

    public static void stampaNodi(Nodo<Integer> nodo){
        if(nodo == null) return;
        System.out.print(nodo.getValue()+" ");
        stampaNodi(nodo.getNodoSuccessivo());
    }

    public static Nodo<Integer> invertitore(Nodo<Integer> nodo){
        if(nodo.getNodoSuccessivo() == null) return nodo;

        Nodo<Integer> nodinoSuccessivo = invertitore(nodo.getNodoSuccessivo());

        nodo.getNodoSuccessivo().setNodoSuccessivo(nodo);
        nodo.setNodoSuccessivo(null);
        return nodinoSuccessivo;
    }
}
