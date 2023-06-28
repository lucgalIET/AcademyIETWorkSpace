package Ricorsione;
//SEQUENZA DI FIBONACCI
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,144, 233, 377
public class Es1_12_06 {
    public static void main(String[] args) {
        //stampaNumeri(15);
        //stampaNumeriRicorsivo(15,0,1);
        //System.out.println(stampaNumeriLucaDaiLibri(15));

        for (int i = 0;i<15;i++){
            System.out.println(stampaNumeriLucaDaiLibri(i));
        }

    }


//    public static void stampaNumeri(int n) {
//        int a = 0;
//        int b = 1;
//        int appoggio = 0;
//
//        for (int i = 0; i <=n ; i++) {
//            appoggio = b + a;
//            a = b;
//            b = appoggio;
//            System.out.println(appoggio);
//        }
//
//    }

    public static int stampaNumeriRicorsivo(int n,int a,int b){
        if(n==0)return n;
        System.out.println(a);
        return stampaNumeriRicorsivo( n-1,b,b+a);

    }

    public static int stampaNumeriLucaDaiLibri(int n){
        if(n<=1) return n;
        return stampaNumeriLucaDaiLibri(n-1) + stampaNumeriLucaDaiLibri(n-2);
    }



}
