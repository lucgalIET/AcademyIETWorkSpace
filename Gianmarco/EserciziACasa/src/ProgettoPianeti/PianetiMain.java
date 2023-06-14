package ProgettoPianeti;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

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

public class PianetiMain {
    static Random random = new Random();

    public static void main(String[] args) {
        Set<CorpoCeleste> setPianeti = new HashSet<>();
        PianetaImpl impl = new PianetaImpl();
        CorpoCeleste terra = new PianetaTerrestre("Terra", 150 * 10 ^ 6, 5972 * 10 ^ 24);
        CorpoCeleste giove = new PianetaGassoso("Giove", 778 * 10 ^ 6, 69911 * 2);

        setPianeti.add(terra);
        setPianeti.add(giove);

        Consumer<CorpoCeleste> stampaPianeti = corpoCeleste -> System.out.println(corpoCeleste.toString());
        setPianeti.forEach(stampaPianeti);

        Supplier<CorpoCeleste> generaPianetaGassoso = () -> {
            String nome = "Nuovo pianeta gasosso";
            int distanzaDalSoleRandom = random.nextInt(1, 10000);
            int diametroRandom = random.nextInt(1, 10000);

            return new PianetaGassoso(nome, distanzaDalSoleRandom, diametroRandom);
        };

        Supplier<CorpoCeleste> generaPianetaTerrestre = () -> {
            String nome = "Nuovo pianeta terrestre";
            int distanzaDalSoleRandom = random.nextInt(1, 10000);
            int massaRandom = random.nextInt(1, 10000);

            return new PianetaTerrestre(nome, distanzaDalSoleRandom, massaRandom);
        };

        CorpoCeleste nuovopianeta = generaPianetaGassoso.get();
        setPianeti.add(nuovopianeta);

        CorpoCeleste nuovoPianeta = generaPianetaTerrestre.get();
        setPianeti.add(nuovoPianeta);

        Runnable calcoloGravita = () -> {
            System.out.println("Esecuzione del calcolo della gravità...");

            for (CorpoCeleste pianeta : setPianeti) {
                pianeta.setGravità(random.nextInt(1, 1000));
            }

            System.out.println("Gravità calcolata!");

        };
        Thread thread = new Thread(calcoloGravita);
        thread.start();

        setPianeti.forEach(System.out::println);
        System.out.println(impl.contaPianeti(setPianeti));


    }

}
