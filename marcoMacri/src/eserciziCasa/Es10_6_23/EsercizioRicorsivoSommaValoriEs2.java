package marcoMacri.src.eserciziCasa.Es10_6_23;
/*




Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array

[BONUS] scrivere i rispettivi metodi iterativi
*/

//Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)
public class EsercizioRicorsivoSommaValoriEs2 {
    public static void main(String[] args) {
        int[]array={9,4,2,5,6,7,4,5,6};
        System.out.println("La somma dell'array è "+ ricorsivoSomma(array[1],array,array.length-1));

    }
    public static int ricorsivoSomma(int somma, int[] array,int lenght){


        somma+=array[lenght];
        if (lenght==0){
            return somma;
        }

        return ricorsivoSomma(somma,array,lenght-1);}}
