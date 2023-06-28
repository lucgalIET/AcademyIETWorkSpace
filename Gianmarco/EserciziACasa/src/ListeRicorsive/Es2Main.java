package ListeRicorsive;

/*
Esercizio 2: Verifica se una lista ricorsiva è ordinata in modo crescente

Implementa una funzione ricorsiva in Java che prenda in input una lista di
numeri interi rappresentata come una lista ricorsiva di nodi e restituisca
true se la lista è ordinata in modo crescente,altrimenti restituisca false.

Testa la tua funzione utilizzando diverse liste di numeri.

 */
public class Es2Main {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(3);
        Nodo nodo3 = new Nodo(2);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);

        boolean sonoOrdinati=ordinati(nodo1);
        System.out.println(sonoOrdinati);


    }


    public static boolean ordinati(Nodo nodo) {
        if (nodo == null || nodo.getNodoSuccessivo() == null) return true;

        else {
            if (nodo.getValue() <= nodo.getNodoSuccessivo().getValue()) {
                return ordinati(nodo.getNodoSuccessivo());
            } else {
                return false;
            }

        }
    }

}
