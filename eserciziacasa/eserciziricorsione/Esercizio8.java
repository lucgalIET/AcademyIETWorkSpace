package eserciziacasa.eserciziricorsione;

import java.util.Arrays;

public class Esercizio8 {
static public int c;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        permutazioniHelper(arr);
        System.out.println(c);
    }

    static public void permutazioni(int[] arr, int index){
        if(index == arr.length) {
            System.out.println(Arrays.toString(arr));
            c++;
            return;
        }
        for(int i = index; i<arr.length; i++){
            swap(arr, index, i);
            permutazioni(arr, index+1);
            swap(arr, index, i);
        }
    }

    static public void permutazioniHelper(int[] arr){
        if(arr.length == 0) return;
        permutazioni(arr, 0);
    }

    static public void swap(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
