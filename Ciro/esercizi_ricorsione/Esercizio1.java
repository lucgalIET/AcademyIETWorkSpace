package Ciro.esercizi_ricorsione;

/*
Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)
 */
public class Esercizio1 {
    public static void main(String[] args) {

        int[] array = {5, 54, 86, 895, 123, 2, 365, 447, 41};

        System.out.println("il valore massimo presente nell' array in modo ricorsico è " + cercaMassimoRicorsivo(array, array.length - 1));
        System.out.println("il valore minimo presente nell'array in modo ricorsivo è " + cercaMinimoRicorsivoArray(array, array.length - 1));
        System.out.println("il valore massismo presente nell' array in modo iterativo è " + cercaMassimoIterativoArray(array));
        System.out.println(("il valore minimo presente nell' array in modo iterativo è " + cercaMinimoIterativoArray(array)));

    }
    private static int cercaMinimoRicorsivoArray(int[] array, int indice) {

        if(indice == 0) return array[indice];

        return minimo(array[indice], cercaMinimoRicorsivoArray(array,indice - 1));
    }

    private static int minimo(int x, int y) {
        if(x < y) return x;
        else return y;
    }


    private static int cercaMassimoRicorsivo(int[] array,int indice) {

        if(indice == 0) return array[indice];

        return massimo(array[indice], cercaMassimoRicorsivo(array, indice - 1));
    }
    private static int massimo(int x, int y){
        if (x > y) return x;
        else return y;
    }

    //bonus
    public static int cercaMassimoIterativoArray(int[] array){

        int massimo = array[0];
        int i = 1;

        while(i < array.length) {
            if (array[i] > massimo)
                massimo = array[i];
            i++;
        }
        return massimo;
    }

    //bonus
    public static int cercaMinimoIterativoArray(int[] array){
        int minimo = array[0];
        int i = 1;

        while (i < array.length){
            if(array[i] < minimo)
                minimo = array[i];
            i++;
        }

        return minimo;

    }
}
