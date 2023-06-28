package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder;

import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder.Character;
import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.characterbuilder.CharacterBuilder;

public class CharacterDirector {
    private CharacterBuilder characterBuilder;

    public CharacterDirector(CharacterBuilder characterBuilder) {
        this.characterBuilder = characterBuilder;
    }

    public Character characterBuilder(){
        characterBuilder.name();
        characterBuilder.race();
        characterBuilder.type();
        characterBuilder.appereance();
        characterBuilder.equipment();
        characterBuilder.abilities();
        return characterBuilder.getCharacter();
    }
}
