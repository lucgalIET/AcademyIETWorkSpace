package eserciziacasa.esercizilistericorsive;

public class Main {

    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        Nodo nodo4 = new Nodo(4);
        Nodo nodo5 = new Nodo(5);

        Nodo nodo11 = new Nodo(10);
        Nodo nodo12 = new Nodo(4);
        Nodo nodo13 = new Nodo(23);
        Nodo nodo14 = new Nodo(47);

        nodo1.setNextElement(nodo2);
        nodo2.setNextElement(nodo3);
        nodo3.setNextElement(nodo4);
        nodo4.setNextElement(nodo5);

        nodo11.setNextElement(nodo12);
        nodo12.setNextElement(nodo13);
        nodo13.setNextElement(nodo14);

        Esercizi es = new Esercizi();

        //ESERCIZIO 1
        System.out.println(es.sommaLista(nodo1));
        System.out.println(es.sommaLista(nodo11));

        //ESERCIZIO 2
        System.out.println(es.ordineCrescente(nodo1));
        System.out.println(es.ordineCrescente(nodo11));

        //ESERCIZIO 3
        es.unioneListe(nodo1, nodo11);
        System.out.println(es.sommaLista(nodo1));

        //ESERCIZIO 4
        NodoString nodoS1 = new NodoString("Ciao");
        NodoString nodoS2 = new NodoString("sono");
        NodoString nodoS3 = new NodoString("manuel");
        NodoString nodoS4 = new NodoString("siuuum");

        nodoS1.setNextElement(nodoS2);
        nodoS2.setNextElement(nodoS3);
        nodoS3.setNextElement(nodoS4);

        System.out.println(es.concatenaStringhe(nodoS1));
    }
}
