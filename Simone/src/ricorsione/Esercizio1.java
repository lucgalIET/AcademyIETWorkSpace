package ricorsione;

//stampare dei numeri in sequenza inversa
public class Esercizio1 {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8};
        stampaSequenzaInversa(numeri);
        stampaSequenzaInversaRicorsiva(numeri, numeri.length - 1);
    }

    //iterativo
    public static void stampaSequenzaInversa(int[] numeri) {
        for (int i = numeri.length - 1; i >= 0; i--) {
            System.out.println(numeri[i]);
        }
    }
    //ricorsiva

    public static void stampaSequenzaInversaRicorsiva(int[] numeri, int i) {
        //System.out.println(numeri[i]);
        if (i == -1)
            return;
        System.out.println(numeri[i]);
        stampaSequenzaInversaRicorsiva(numeri,i-1);
    }

}
