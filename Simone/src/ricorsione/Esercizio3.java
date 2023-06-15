package ricorsione;
// Stampa di tutti i sottomassi di una stringa
//Scrivi una funzione ricorsiva in Java che prenda in input una stringa e stampi tutti i sottomassi possibili.
//Un sottomasso di una stringa è ottenuto selezionando un insieme di caratteri consecutivi dalla stringa originale, in qualsiasi ordine.
//Ad esempio, per la stringa "abc", i sottomassi sono: "", "a", "b", "c", "ab", "ac", "bc", "abc".
public class Esercizio3 {
    public static void main(String[] args) {
        String s="abc";
      //  sottoMassi(s);
        sottoMassiRicorsiva(s);

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
            t=s.substring(s.length()-1)+t;
            s=s.substring(0,s.length()-1);
            System.out.println(t);
            sottoMassiRicorsivaTailR(s,t);
            t=t.substring(0,t.length());
            s=t.substring(0,t.length()-1);
            System.out.println(s);
        }
    }

}