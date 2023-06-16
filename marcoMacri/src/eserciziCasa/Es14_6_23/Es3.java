package marcoMacri.src.eserciziCasa.Es14_6_23;
//Esercizio 3: Concatenazione di due liste ricorsive
//        Implementa una funzione ricorsiva in Java che prenda in input due liste di interi rappresentate come liste ricorsive di
//        nodi e restituisca una nuova lista che sia la concatenazione delle due liste di input. Testa la tua funzione utilizzando
//        diverse combinazioni di liste di interi.
public class Es3 {
    private static int i=0;
    private static Nodo<Integer> nodo3;
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

        Nodo nodo1b = new Nodo<Integer>(7);
        Nodo nodo2b= new Nodo<Integer>(2);

        Nodo nodo3b = new Nodo<Integer>(6);

        Nodo nodo4b = new Nodo<Integer>(4);
        Nodo nodo5b = new Nodo<Integer>(5);
        nodo1b.setNodoSuccessivo(nodo2b);
        nodo2b.setNodoSuccessivo(nodo3b);
        nodo3b.setNodoSuccessivo(nodo4b);
        nodo4b.setNodoSuccessivo(nodo5b);
        nodo5b.setNodoSuccessivo(null);

        stampaElementiListaNodo(nodo1);
        stampaElementiListaNodo(nodo1b);
        Nodo<Integer> nodoConcatenato = concatenaListe(nodo1,nodo1b);
        stampaElementiListaNodo(nodoConcatenato);

    }
    public static Nodo<Integer> concatenaListe(Nodo<Integer> nodo,Nodo<Integer> nodo1){


        if(i==0) nodo3 = nodo;
        i++;
        if (nodo1==null) return nodo;
        if(nodo.getNodoSuccessivo()==null) {
            nodo.setNodoSuccessivo(nodo1);
            return nodo3;
        }
        return concatenaListe(nodo.getNodoSuccessivo(),nodo1);
    }
    public static int stampaElementiListaNodo(Nodo<Integer> nodo){
        if(nodo==null){
            System.out.println(" ");
            return 0;}
        System.out.print(nodo.getValore());
        return stampaElementiListaNodo(nodo.getNodoSuccessivo());
    }
}


