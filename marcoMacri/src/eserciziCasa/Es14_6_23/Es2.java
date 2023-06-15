package marcoMacri.src.eserciziCasa.Es14_6_23;

//Esercizio 2: Verifica se una lista ricorsiva è ordinata in modo crescente
//        Implementa una funzione ricorsiva in Java che prenda in input una lista di numeri interi rappresentata come una lista ricorsiva
//        di nodi e restituisca true se la lista è ordinata in modo crescente, altrimenti restituisca false.
//        Testa la tua funzione utilizzando diverse liste di numeri.
public class Es2 {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo<Integer>(1);
        Nodo nodo2 = new Nodo<Integer>(2);

        Nodo nodo3 = new Nodo<Integer>(3);

        Nodo nodo4 = new Nodo<Integer>(4);
        Nodo nodo5 = new Nodo<Integer>(5);
        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);
        nodo5.setNodoSuccessivo(null);

        Nodo nodo1b = new Nodo<Integer>(1);
        Nodo nodo2b= new Nodo<Integer>(2);

        Nodo nodo3b = new Nodo<Integer>(6);

        Nodo nodo4b = new Nodo<Integer>(4);
        Nodo nodo5b = new Nodo<Integer>(5);
        nodo1b.setNodoSuccessivo(nodo2b);
        nodo2b.setNodoSuccessivo(nodo3b);
        nodo3b.setNodoSuccessivo(nodo4b);
        nodo4b.setNodoSuccessivo(nodo5b);
        nodo5b.setNodoSuccessivo(null);
        System.out.println("La lista è ordinata secondo un ordine cresente "+ controlloListaOrdineCrescente(nodo1,nodo2));
        System.out.println("La lista è ordinata secondo un ordine cresente "+ controlloListaOrdineCrescente(nodo1b,nodo2b));


    }
    public static boolean controlloListaOrdineCrescente(Nodo<Integer> nodo,Nodo<Integer> nodo1){
        if(nodo==null || nodo1 == null)return true;
        if (nodo.getValore()< nodo1.getValore()){
            return controlloListaOrdineCrescente(nodo1,nodo1.getNodoSuccessivo());
        }else{
            return false;
        }
    }


}
