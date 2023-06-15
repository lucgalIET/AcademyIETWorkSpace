package Ciro.esercizi_ricorsione;
/*
Scrivere un metodo boolean che verifica se un intero è contenuto in un array
 */
public class Esercizio4 {
    public static void main(String[] args) {

        int[] array = {2,6,8,12,54,65};

           System.out.println(verificaElementoRicorsiva(array, array.length - 1, 79));
           System.out.println(verificaElementoRicorsiva(array, array.length - 1, 8));
           System.out.println(verificaElementoIterativo(array,79));
           System.out.println(verificaElementoIterativo(array,  8));


    }
    //bonus versione iterativa
    private static boolean verificaElementoIterativo(int[] array, int elem) {

        for(int i = 0; i < array.length; i++){
            if(array[i] == elem)
               return true;

        }
        return  false;
    }

    private static boolean verificaElementoRicorsiva(int[] array, int indice, int elem) {

        if(indice == -1) return false;
        if(array[indice] == elem) return true;
        return verificaElementoRicorsiva(array, indice -1, elem);
    }



}
