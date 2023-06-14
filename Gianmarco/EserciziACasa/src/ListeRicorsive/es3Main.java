package ListeRicorsive;
/*
Esercizio 3: Concatenazione di due liste ricorsive

Implementa una funzione ricorsiva in Java che prenda in input
due liste di interi rappresentate come liste ricorsive di
nodi e restituisca una nuova lista che sia la concatenazione
delle due liste di input.

Testa la tua funzione utilizzando
diverse combinazioni di liste di interi.
 */
public class es3Main {
    public static void main(String[] args) {
        Nodo nodoA1 = new Nodo(1);
        Nodo nodoA2 = new Nodo(2);
        Nodo nodoA3 = new Nodo(3);

        nodoA1.setNodoSuccessivo(nodoA2);
        nodoA2.setNodoSuccessivo(nodoA3);

        Nodo nodoB1 = new Nodo(4);
        Nodo nodoB2 = new Nodo(5);
        Nodo nodoB3 = new Nodo(6);

        nodoB1.setNodoSuccessivo(nodoB2);
        nodoB2.setNodoSuccessivo(nodoB3);

        Nodo risultato = nodiConcatenati(nodoA1,nodoB1);

        System.out.println(risultato);


    }
    public static Nodo nodiConcatenati(Nodo nodoA1,Nodo nodoB1){
        if(nodoA1==null)return nodoB1;

        nodoA1.setNodoSuccessivo(nodiConcatenati(nodoA1.getNodoSuccessivo(),nodoB1));
        return nodoA1;
    }



}
