package EserciziInClasse.EsercizioPianeti;
/*creare un programma java per calcolare alcune informazioni su diversi corpi celesti, tra cui pianeti terrestri e pianeti gassosi.

1. Definisci un'interfaccia chiamata "Pianeta" con il seguente metodo:
   - contaPianeti()
   - scopriPianeta()
  // - calcolaGravita(): restituisce un valore double rappresentante l'accelerazione di gravità del pianeta.

2. Crea una classe chiamata "CorpoCeleste" che implementi l'interfaccia "Pianeta" e abbia i seguenti attributi:
   - nome (String): rappresenta il nome del corpo celeste.
   - tipo
   - distanza dal sole


3. Definisci le classi dei vari pianeti (es: PianetaTerra)

     - massa (double): rappresenta la massa del pianeta terrestre.
     - diametro (double): rappresenta il diametro del pianeta gassoso.

4. Nella classe principale "PianetiMain":
   - Crea una lista di tipo "CorpoCeleste".
   - Crea almeno due istanze di pianeti, uno terrestre e uno gassoso.
   - Aggiungi le istanze alla lista di corpi celesti.*/
public abstract class CorpoCeleste {
    private String nome;
    private boolean tipo;
    private double distanzaDalSole;

    public CorpoCeleste() {
    }

    public CorpoCeleste(String nome, boolean tipo, double distanzaDalSole) {
        this.nome = nome;
        this.tipo = tipo;
        this.distanzaDalSole = distanzaDalSole;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public double getDistanzaDalSole() {
        return distanzaDalSole;
    }

    public void setDistanzaDalSole(double distanzaDalSole) {
        this.distanzaDalSole = distanzaDalSole;
    }
}
