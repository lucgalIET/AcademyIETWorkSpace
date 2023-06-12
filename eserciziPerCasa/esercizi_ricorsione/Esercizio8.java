package eserciziPerCasa.esercizi_ricorsione;
/*
metodo ricorsivo e iterativo che calcola il massimo comune divisore di due numeri interi
 */
public class Esercizio8 {
    public static void main(String[] args) {
        System.out.println(massimoComuneDivisore(21,14));
        System.out.println(massimoComuneDivisoreRicorsivo(21,14));
    }

    static public int massimoComuneDivisore(int primoNumero, int secondoNumero){
        if(primoNumero == 0) return secondoNumero;
        if(secondoNumero == 0) return primoNumero;

        while(secondoNumero != 0){
            int temp = primoNumero % secondoNumero;
            primoNumero = secondoNumero;
            secondoNumero = temp;
        }
        return primoNumero;
    }

    //versione ricorsiva
    static public int massimoComuneDivisoreRicorsivo(int primoNumero, int secondoNumero){
        if(primoNumero == 0) return secondoNumero;
        if(secondoNumero == 0) return primoNumero;

        return massimoComuneDivisoreRicorsivo(secondoNumero, primoNumero%secondoNumero);

    }
}
