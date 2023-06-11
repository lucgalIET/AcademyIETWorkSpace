package esercizi.src.eserciziCasa.Es10_6_23;
//Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)



public class EsercizioRicorsovoMinMaxEs1 {

    public static void main(String[] args) {
        int[]array={9,4,2,5,6,7,4,5,6};
        System.out.println("Il valore minimo dell'array è "+ ricorsivoMin(array[1],array,array.length-1));

    }
    public static int ricorsivoMin(int min,int[] array,int lenght){

        if (array[lenght] < min){
            min=array[lenght];

        }
        if (lenght==0){
            return min;
        }

    return ricorsivoMin(min,array,lenght-1);}

}
