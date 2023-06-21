package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06;

public class Main {
    public static void main(String[] args) {
        CharacterBuilder characterBuilder = new CharacterConstructor();
        CharacterDirector characterDirector = new CharacterDirector(characterBuilder);
        Character character = characterDirector.characterBuilder();

        System.out.println(character);
    }
}
