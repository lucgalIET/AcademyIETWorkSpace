package esercizi.src.eserciziLezione.Es12_6_23;
//calcolare il massimo comune divisore di due numeri interi
public class EsercizioRicorsioneIterativo {
    public static void main(String[] args) {
        System.out.println(massimoComuneDivisore(21,14));
        System.out.println(massimoComuneDivisoreRicorsivo(21,14));

    }
//    public static int massimoComuneDivisore(int primoNumero, int secondoNumero){
//        for(int i = 0; i<(Math.min(secondoNumero, primoNumero)); i--){
//        if (primoNumero>=secondoNumero){
//            if(primoNumero==secondoNumero){
//                return secondoNumero;
//            }
//            else if(primoNumero%secondoNumero==0){
//                return secondoNumero;
//            }else {(secondoNumero /i;
//
//            }
//        }}
//    }
    public static int massimoComuneDivisore(int primoNumero,int secondoNumero){
        if(primoNumero==0) return secondoNumero;
        if(secondoNumero==0) return primoNumero;
        while(secondoNumero!=0){
            int temp = primoNumero%secondoNumero;
                primoNumero=secondoNumero;
                secondoNumero=temp;
        }
    return primoNumero;
    }
    public static int massimoComuneDivisoreRicorsivo(int primoNumero,int secondoNumero){
        if(primoNumero==0) return secondoNumero;
        if(secondoNumero==0) return primoNumero;
        return massimoComuneDivisoreRicorsivo(secondoNumero,primoNumero%secondoNumero);
    }


}
