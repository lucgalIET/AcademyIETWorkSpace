package perCasa.esercizi_14_06_2023;

//Esercizio 2: Verifica se una lista ricorsiva è ordinata in modo crescente
//Implementa una funzione ricorsiva in Java che prenda in input una lista di numeri interi rappresentata come una lista ricorsiva
//di nodi e restituisca true se la lista è ordinata in modo crescente, altrimenti restituisca false.
//Testa la tua funzione utilizzando diverse liste di numeri.
public class Esercizio2 {

    public static void main(String[] args) {
        Nodo<Integer> nodo1 = new Nodo<>(4);
        Nodo<Integer> nodo2 = new Nodo<>(8);
        Nodo<Integer> nodo3 = new Nodo<>(2);
        Nodo<Integer> nodo4 = new Nodo<>(9);
        Nodo<Integer> nodo5 = new Nodo<>(3);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);

        Nodo<Integer> n1 = new Nodo<>(1);
        Nodo<Integer> n2 = new Nodo<>(2);
        Nodo<Integer> n3 = new Nodo<>(3);
        Nodo<Integer> n4 = new Nodo<>(4);
        Nodo<Integer> n5 = new Nodo<>(5);

        n1.setNodoSuccessivo(n2);
        n2.setNodoSuccessivo(n3);
        n3.setNodoSuccessivo(n4);
        n4.setNodoSuccessivo(n5);

        System.out.println("La lista è ordinata in ordine crescente? "+ verificaCrescente(nodo1));
        System.out.println("La lista è ordinata in ordine crescente? "+ verificaCrescente(n1));

    }

    public static boolean verificaCrescente(Nodo<Integer> nodo){
        if(nodo.getNodoSuccessivo() == null)return true;
        if(nodo.getValore() > nodo.getNodoSuccessivo().getValore()) return false;
        return verificaCrescente(nodo.getNodoSuccessivo());
    }
}
