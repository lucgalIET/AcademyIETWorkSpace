package eserciziPerCasa.esercizi_ricorsione;
/*
metodo ricorsivo e iterativo
 */
public class Esercizio9 {
    public static void main(String[] args) {
        String stringa = "abc";
        sottoMassi(stringa);
    }

    public static void sottoMassi(String s){

        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static void sottoMassiRicorsivo(String s) {
         sottoMassiRicorsivoTeilR(s, "");
    }

    public static void sottoMassiRicorsivoTeilR(String s, String t){
        if(s.isEmpty()){
            System.out.println(t);
        }else {
            sottoMassiRicorsivoTeilR();
        }

    }
    }