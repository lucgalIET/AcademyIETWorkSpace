package EserciziInClasse.EsercizioRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EserciziRegex {
    public static void main(String[] args) {

        // verifica se una stringa contiene solo caratteri alfabetici
        String stringa = "Sonosoloparole";
        String stringa2 = "N0n 50l0 p4r0l3";
        String regex = "^[a-zA-Z]*$";

        boolean isValid = stringa.matches(regex);
        System.out.println(isValid); //Controllo stringa solo parole

        boolean isValid2 = stringa2.matches(regex);
        System.out.println(isValid2); //Controllo stringa con numeri

        //trova tutte le occorrenze di numeri in una stringa
        String stringaNumeri = "I nostri numeri sono 3, 56, 47, 1";
        String regex1 = "\\d+";

        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(stringaNumeri);

        int somma = 0;
        while (matcher.find()) {
            int num;
            num = Integer.parseInt(matcher.group());
            System.out.println(num);
            somma += num;
        }
        System.out.println(somma);


        String regexx = ".\\S+@[a-zA-Z]+\\.[a-z]{2,3}"; //Altra soluzione per la regex delle email
        String email = "pippo._ franco@gmail.com";
        System.out.println(email.matches(regexx));
        System.out.println(email);
    }
}
