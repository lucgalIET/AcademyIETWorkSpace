package inClasse.Esercizi_12_06_2023;

//
public class Ricorsione {

    // a ab abc b bc c

    public static void main(String[] args) {
        String stringa = "abcdef";
        //sottoMassi(stringa);
        sottoMassiRicorsiva(stringa);
    }

    public static void sottoMassi(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static void sottoMassiRicorsiva(String s) {
        sottoMassiRicorsivaTailR(s, s);
    }

    // a ab abc b bc c
    public static void sottoMassiRicorsivaTailR(String s, String t) {
        if (s.isEmpty()) {
            System.out.println(t);
        } else {
            String substring = s.substring(s.length() - t.length());
            if (s.length() == 1) {
                if (t.length() > 1) {
                    t = substring;
                    System.out.println(t);
                    sottoMassiRicorsivaTailR(s, s.substring(s.length() - t.length(), 0));
                }else{
                    t = substring;
                    sottoMassiRicorsivaTailR("",t);
                }
            } else {
                if (t.length() > 0) {
                    t = substring;
                    System.out.println(t);
                    sottoMassiRicorsivaTailR(s, s.substring(s.length() - t.length(), s.length() - 1));
                } else {
                    sottoMassiRicorsivaTailR(s.substring(0, s.length() - 1), s.substring(1));
                }
            }
        }
    }

}
