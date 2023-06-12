package inClasse.Esercizi_12_06_2023;

//
public class Ricorsione {

    public static void main(String[] args) {
        String stringa = "abc";
        sottoMassi(stringa);
    }

    public static void sottoMassi(String s){

        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static void sottoMassiRicorsiva(String s){
        sottoMassiRicorsivaTailR(s, "");
    }

    public static void sottoMassiRicorsivaTailR(String s, String t){
        if(s.isEmpty()){
            System.out.println(t);
        }else{
            //sottoMassiRicorsivaTailR();
        }
    }

}
