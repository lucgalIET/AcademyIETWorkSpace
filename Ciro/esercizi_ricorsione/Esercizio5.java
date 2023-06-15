package Ciro.esercizi_ricorsione;
/*
Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)
presenti all’interno di un array
 */
public class Esercizio5 {
    public static void main(String[] args) {
        int[] array = {2,1,4,3};

        System.out.println("Somma numeri pari nell' array in modo ricorsivo " + sommaPariRicorsivo(array, array.length - 1));
        System.out.println("Somma numeri dispari nell' array in modo ricorsivo " + sommaDispariRicorsivo(array, array.length - 1));

        System.out.println("Somma numeri pari nell' array in modo iterativo " + sommaPariIterativo(array));
        System.out.println("Somma numeri dispari nell' array in modo iterativo "  + sommaDispariIterativo(array));
    }

    private static int sommaDispariRicorsivo(int[] array, int indice) {

        if(indice == -1) return 0;
//        if(array[indice] %2 != 0) return array[indice] + sommaDispariRicorsivo(array, indice - 1);
//
//        return sommaDispariRicorsivo(array, indice -1);
       return (array[indice] %2 != 0) ? (array[indice] + sommaDispariRicorsivo(array, indice - 1)) : (sommaDispariRicorsivo(array, indice -1));
    }

    private static int sommaPariRicorsivo(int[] array, int indice) {

        if(indice == -1) return 0;
        if(array[indice] %2 == 0) return array[indice] + sommaPariRicorsivo(array, indice - 1);

        return sommaPariRicorsivo(array, indice -1);

    }

    public static int sommaPariIterativo(int[] array){
        int somma = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] %2 == 0)
                somma += array[i];
        }

        return somma;
    }

    public static int sommaDispariIterativo(int[] array){
        int somma = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] %2 != 0)
                somma += array[i];
        }

        return somma;
    }
}
