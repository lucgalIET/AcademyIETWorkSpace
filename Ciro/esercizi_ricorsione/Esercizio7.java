package Ciro.esercizi_ricorsione;
/*
verificare se un numero in inout è primo sia iterativamente che ricorsivcamente
 */
public class Esercizio7 {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(primoI(n));
        System.out.println(primoR(n, (int)Math.sqrt(n)));
        System.out.println(primoTR(n));

    }
   public static boolean primoI(int n){

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) return false;
        }
        return true;
    }

    public static boolean primoR(int n, int count){
        if(n==0) return false;
        if(count == 1) return true;

        return n % count != 0 && primoR(n, count - 1);

    }

    //tail recursion
    static public boolean primoTR(int n){
        if(n == 0) return false;
        if(n == 1) return true;
        return metodino(n, n/2);
    }

    static public boolean metodino(int n, int count){
        if(count == 1) return true;
        if(n%count == 0) return false;
        return metodino(n, count - 1);
    }
}
