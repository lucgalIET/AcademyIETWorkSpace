package eserciziinclasseakaquandosoffroio.eseciziricorsione09_06;
//stampa una stringa in sequenza inversa
public class Ricorsione {

    public static void main(String[] args) {
        stampaStringaIter("ciaone");
        System.out.println();
        stampaStringaRec("ciaone");
    }

    public static void stampaStringaIter(String s){
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }

    public static void stampaStringaRec(String s){
        if(s.isEmpty()) return;
        System.out.print(s.charAt(0));
        stampaStringaRec(s.substring(1));
    }
}
