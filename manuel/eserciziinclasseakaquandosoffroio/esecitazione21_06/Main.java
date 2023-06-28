package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06;

import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder.Character;
import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder.CharacterBuilder;
import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder.CharacterConstructor;
import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder.CharacterDirector;

public class Main {
    public static void main(String[] args) {
        CharacterBuilder characterBuilder = new CharacterConstructor();
        CharacterDirector characterDirector = new CharacterDirector(characterBuilder);
        Character character = characterDirector.characterBuilder();

        System.out.println(character);
    }
}
