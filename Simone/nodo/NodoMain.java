package EsercizioPianeti.nodo;

import java.util.concurrent.Semaphore;

public class NodoMain {
    public static void main(String[] args) {
        Nodo<Integer> nodo1=new Nodo<>(1);
        Nodo<Integer> nodo2=new Nodo<>(2);
        Nodo<Integer> nodo3=new Nodo<>(3);
        Nodo<Integer> nodo4=new Nodo<>(4);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        stampaNodi(nodo1);
    }

    public static void stampaNodi(Nodo<Integer> nodo){
        if(nodo==null)return;
        System.out.println(nodo.getValore());
        stampaNodi(nodo.getNodoSuccessivo());
    }
}
