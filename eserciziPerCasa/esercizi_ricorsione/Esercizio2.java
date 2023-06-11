package eserciziPerCasa.esercizi_ricorsione;
/*
Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)

 */
public class Esercizio2 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.println("La somma degli elementi dell' array in modo ricorsive è " + soomaRicorsivaArray(array, array.length - 1));
        System.out.println("La somma degli elementi dell' array in modo iterative è " + sommaIterativaArray(array));
    }

    //versione ricorsiva
    private static int soomaRicorsivaArray(int[] array, int indice) {

        if(indice == 0) return array[0];

        return array[indice] + soomaRicorsivaArray(array, indice - 1);

    }

    //bonus versione iterativa
    public static int sommaIterativaArray(int[] array){

        int somma = 0;
        for(int i = 0; i < array.length; i++){
            somma += array[i];
        }

        return somma;
    }
}
