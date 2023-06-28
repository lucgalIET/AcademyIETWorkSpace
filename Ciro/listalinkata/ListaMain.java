package Ciro.listalinkata;

public class ListaMain {
    public static void main(String[] args) {

        Lista lista = new ListaLinkata();
//        lista.aggiungiElemento(1);
//        lista.aggiungiElemento(2);
//        lista.aggiungiElemento(3);
//        lista.aggiungiElemento(4);
//        lista.aggiungiElemento(5);
//        lista.aggiungiElemento(6);
//

        lista.inserisciElementi(lista);

        System.out.println(lista.testa());
        lista.stampaLista();
       // lista.elimineElemento();
      //  lista.testa();
       // lista.stampaLista();


    }

}
