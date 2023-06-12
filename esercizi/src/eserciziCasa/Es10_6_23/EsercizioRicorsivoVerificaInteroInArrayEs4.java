package esercizi.src.eserciziCasa.Es10_6_23;
//Scrivere un metodo boolean che verifica se un intero è contenuto in un array
public class EsercizioRicorsivoVerificaInteroInArrayEs4 {
    public static void main(String[] args) {


    int[]array={9,4,2,5,6,7,4,5,6};
        System.out.println("Il valore è presente nell'array: "+ ricorsivoSomma(1,array,array.length-1));

}
    public static boolean ricorsivoSomma(int valore, int[] array,int lenght){


        if (array[lenght]==valore){
            return true;
        }
        if (lenght==0){
            return false;
        }

        return ricorsivoSomma(valore,array,lenght-1);}}
