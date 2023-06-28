package marcoMacri.src.eserciziCasa.Es22_6_23.Albergo;

public class AlbergoMain {
    public static void main(String[] args) {
        AlbergoBuilder stanzaBuilder = new StanzaSingola();
        AlbergoDirector pizzaDirector = new AlbergoDirector(stanzaBuilder);

        Albergo stanzaSingola = pizzaDirector.constructorStanza();
        System.out.println(stanzaSingola);

        AlbergoBuilder stanzaBuilder1 = new StanzaDoppia();
        AlbergoDirector pizzaDirector1 = new AlbergoDirector(stanzaBuilder);

        Albergo stanzaDoppia = pizzaDirector.constructorStanza();
        System.out.println(stanzaSingola);


    }
}