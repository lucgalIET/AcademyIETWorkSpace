package marcoMacri.src.eserciziCasa.Es10_6_23;
//Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array
public class EsercizioRicorsivoSommaPariEs5 {

    public static void main(String[] args) {
        int[]array={9,4,2,5,6,7,4,5,6};
        System.out.println("La somma dei valori pari dell'array è "+ ricorsivoSommaPari(array[1],array,array.length-1));

    }
    public static int ricorsivoSommaPari(int somma, int[] array, int lenght){

        if(array[lenght]%2==0){
        somma+=array[lenght];}
        if (lenght==0){
            return somma;
        }

        return ricorsivoSommaPari(somma,array,lenght-1);}}
