package esercizi.src.eserciziCasa.Es12_6_23;

public class EsercizioRicorsivoSottomassiStringaEs1 {
    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    public EsercizioRicorsivoSottomassiStringaEs1( final String str ){
        inputstring = str;
        System.out.println("La stringa in ingresso è: " + inputstring);
    }


    public static void main (String args[])
    {
        EsercizioRicorsivoSottomassiStringaEs1 esercizioRicorsivoSottomassiStringaEs1= new EsercizioRicorsivoSottomassiStringaEs1("wxyz");
        System.out.println("");
        System.out.println("");
        System.out.println("Tutte le possibili combinazioni sono:  ");
        System.out.println("");
        System.out.println("");
        esercizioRicorsivoSottomassiStringaEs1.combina( 0 );
    }


    public void combina(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            System.out.println( output );
            if ( i < inputstring.length() )
                combina( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
}