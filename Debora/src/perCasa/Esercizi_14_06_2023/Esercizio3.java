package perCasa.Esercizi_14_06_2023;

//Esercizio 3: Concatenazione di due liste ricorsive
//Implementa una funzione ricorsiva in Java che prenda in input due liste di interi rappresentate come liste ricorsive di
//nodi e restituisca una nuova lista che sia la concatenazione delle due liste di input. Testa la tua funzione utilizzando
//diverse combinazioni di liste di interi.

//SBAGLIATO!!
public class Esercizio3 {

    public static void main(String[] args) {

        Nodo<Integer> nodo1 = new Nodo<>(4);
        Nodo<Integer> nodo2 = new Nodo<>(12);
        Nodo<Integer> nodo3 = new Nodo<>(6);
        Nodo<Integer> nodo4 = new Nodo<>(1);
        Nodo<Integer> nodo5 = new Nodo<>(16);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);

        Nodo<Integer> n1 = new Nodo<>(7);
        Nodo<Integer> n2 = new Nodo<>(9);
        Nodo<Integer> n3 = new Nodo<>(13);
        Nodo<Integer> n4 = new Nodo<>(2);
        Nodo<Integer> n5 = new Nodo<>(8);

        n1.setNodoSuccessivo(n2);
        n2.setNodoSuccessivo(n3);
        n3.setNodoSuccessivo(n4);
        n4.setNodoSuccessivo(n5);
        concatena(nodo1,n1);
        stampaNodi(nodo1);

    }

    public static void concatena(Nodo<Integer> nodo1, Nodo<Integer> nodo2){
        if(nodo1.getNodoSuccessivo() == null) {
            nodo1.setNodoSuccessivo(nodo2);
            concatena(nodo1.getNodoSuccessivo(), nodo2.getNodoSuccessivo());
        }
        if(nodo1 == null) return;
        concatena(nodo1.getNodoSuccessivo(), nodo2);
    }

    public static void stampaNodi(Nodo<Integer> nodo){
        if(nodo == null) return;
        System.out.println(nodo.getValore());
        stampaNodi(nodo.getNodoSuccessivo());
    }
}
