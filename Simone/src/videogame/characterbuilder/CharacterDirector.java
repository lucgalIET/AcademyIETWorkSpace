package videogame.characterbuilder;

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
