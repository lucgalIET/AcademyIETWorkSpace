package manuel.eserciziinclasseakaquandosoffroio.eserciziostream05_06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {


    public static void main(String[] args) {
        class Persona{
            private String nome;
            private int eta;

            public Persona(String nome, int eta) {
                this.nome = nome;
                this.eta = eta;
            }

            public String getNome() {
                return nome;
            }

            public int getEta() {
                return eta;
            }

            @Override
            public String toString() {
                return "Nome: "+nome+" Eta: "+eta+"\n";
            }
        }


        List<Persona> persone = Arrays.asList(new Persona("Franco",54),new Persona("Giorgio",72), new Persona("Piero",14), new Persona("Gino",72));
        Map<Integer, List<Persona>> mappa = persone.stream()
                .collect(Collectors.groupingBy(Persona::getEta));
        System.out.println(mappa);
    }
}
