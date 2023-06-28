package manuel.eserciziinclasseakaquandosoffroio.eserciziricorsione12_06;
//verificare se un numero è primo

public class RicorsioneNumeroPrimo {

    public static void main(String[] args) {
        int n = 10;
//        System.out.println(primoI(n));
//        System.out.println(primoR(n,(int)Math.sqrt(n)));
        System.out.println(primoTR(1));
    }

    public static boolean primoI(int n){
        if(n==0) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public static boolean primoR(int n, int count){
        if(n==0) return false;
        if(count == 1) return true;
        return (n%count != 0) ? primoR(n, count-1) : false;
    }

    static public boolean primoTR(int n){
        if(n==0) return false;
        if(n==1) return true;
        return metodino(n, n/2);
    }

    static public boolean metodino(int n, int count){
        if(count == 1) return true;
        if(n%count == 0) return false;
        return metodino(n,count-1);
    }
}
