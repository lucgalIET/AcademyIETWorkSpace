package EsercizioPianeti.ricorsionees14_06;



public class Main {
    public static void main(String[] args) {


        Nodo<Integer> nodo1=new Nodo<>(2);
        Nodo<Integer> nodo2=new Nodo<>(3);
        Nodo<Integer> nodo3=new Nodo<>(8);
        Nodo<Integer> nodo4=new Nodo<>(9);

        Nodo<Integer> nodo5=new Nodo<>(10);
        Nodo<Integer> nodo6=new Nodo<>(8);
        Nodo<Integer> nodo7=new Nodo<>(2);
        Nodo<Integer> nodo8=new Nodo<>(3);

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);

        nodo5.setNodoSuccessivo(nodo6);
        nodo6.setNodoSuccessivo(nodo7);
        nodo7.setNodoSuccessivo(nodo8);

        Nodo<String> nodo9=new Nodo<>("Ciao");
        Nodo<String> nodo10=new Nodo<>("mondo");
        Nodo<String> nodo11=new Nodo<>("!");

        nodo9.setNodoSuccessivo(nodo10);
        nodo10.setNodoSuccessivo(nodo11);

        System.out.println(concatenazioneString(nodo9));

        System.out.println(sommaNodi(nodo1));
        System.out.println(nodoOrdinato(nodo1));
        System.out.println(concatenazioneNodi(nodo1,nodo5));
    }
    /*
    Somma degli elementi di una lista ricorsiva
    Implementa una funzione ricorsiva in Java che prenda in input una lista di interi rappresentata come una lista ricorsiva di nodi
    e restituisca la somma di tutti gli elementi nella lista. Testa la tua funzione utilizzando diverse liste di interi.
     */
    public static int sommaNodi(Nodo<Integer> nodo){
        if(nodo==null) return 0;

        return nodo.getValore()+sommaNodi(nodo.getNodoSuccessivo());
    }
/*
Verifica se una lista ricorsiva è ordinata in modo crescente
Implementa una funzione ricorsiva in Java che prenda in input una lista di numeri interi rappresentata come una lista ricorsiva
 di nodi e restituisca true se la lista è ordinata in modo crescente, altrimenti restituisca false.
 Testa la tua funzione utilizzando diverse liste di numeri.
 */
    public static boolean nodoOrdinato(Nodo<Integer> nodo){
        if(nodo.getNodoSuccessivo()==null) return true;

        if(nodo.getValore()<=nodo.getNodoSuccessivo().getValore()){
            return nodoOrdinato(nodo.getNodoSuccessivo());
        }else {
            return false;
        }
    }
/*
Concatenazione di due liste ricorsive
Implementa una funzione ricorsiva in Java che prenda in input due liste di interi rappresentate come liste ricorsive di
nodi e restituisca una nuova lista che sia la concatenazione delle due liste di input. Testa la tua funzione utilizzando
diverse combinazioni di liste di interi.
 */
    public static Nodo<Integer> concatenazioneNodi(Nodo<Integer> nodo1, Nodo<Integer> nodo2){
        if(nodo1==null) return nodo2;

        nodo1.setNodoSuccessivo(concatenazioneNodi(nodo1.getNodoSuccessivo(),nodo2));
        return nodo1;
    }

    /*
   Concatenazione delle stringhe in una lista ricorsiva
Scrivi una funzione ricorsiva in Java che prenda in input una lista di nodi, dove ogni nodo contiene una stringa,
 e restituisca la concatenazione di tutte le stringhe presenti nella lista. La funzione dovrà restituire una singola
 stringa che rappresenta la concatenazione delle stringhe dei nodi successivi nella lista.
     */

    public static String concatenazioneString(Nodo<String> nodo){
        if(nodo==null) return"";

        String conc=nodo.getValore()+" "+concatenazioneString(nodo.getNodoSuccessivo());
        return conc;
    }
}
