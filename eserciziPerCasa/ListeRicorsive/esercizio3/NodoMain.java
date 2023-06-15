package eserciziPerCasa.ListeRicorsive.esercizio3;

public class NodoMain {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(10);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(31);
        Nodo nodo4 = new Nodo(4);
        Nodo nodo5 = new Nodo(5);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);

        Nodo nodo6 = new Nodo(2);
        Nodo nodo7 = new Nodo(1);
        Nodo nodo8 = new Nodo(44);
        Nodo nodo9 = new Nodo(56);

        nodo6.setNodoSuccessivo(nodo7);
        nodo7.setNodoSuccessivo(nodo8);
        nodo8.setNodoSuccessivo(nodo9);

        concatenazioneNodi(nodo1, nodo6);
        stampaNodi(nodo1);

    }

    public static Nodo concatenazioneNodi(Nodo nodo1, Nodo nodo6){
        if(nodo1 == null) return nodo6;

        nodo1.setNodoSuccessivo(concatenazioneNodi(nodo1.getNodoSuccessivo(),nodo6));

        return nodo1;
    }


    public static void stampaNodi(Nodo nodo) {
        if (nodo == null) return;
        System.out.print(nodo.getValue() + " ");
        stampaNodi(nodo.getNodoSuccessivo());
    }

}
