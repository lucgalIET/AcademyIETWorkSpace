package esercizi.src.eserciziCasa.Es12_6_23;

public class EsercizioRicorsivoSottomassiStringaEs1 {
    private final StringBuilder output = new StringBuilder();
    private final String inputstring;
    public EsercizioRicorsivoSottomassiStringaEs1( final String str ){
        this.inputstring = str;
        System.out.println("La stringa in ingresso è: " + this.inputstring);
    }


    public static void main (String[] args)
    {
        EsercizioRicorsivoSottomassiStringaEs1 esercizioRicorsivoSottomassiStringaEs1= new EsercizioRicorsivoSottomassiStringaEs1("wxyz");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Tutte le possibili combinazioni sono:  ");
        System.out.println(" ");
        System.out.println(" ");
        esercizioRicorsivoSottomassiStringaEs1.combina( 0 );
    }


    public void combina(int start ){
        for( int i = start; i < this.inputstring.length(); ++i ){
            this.output.append( this.inputstring.charAt(i) );
            System.out.println( output );
            combina( i + 1);
            this.output.setLength( this.output.length() - 1 );
        }
    }
}