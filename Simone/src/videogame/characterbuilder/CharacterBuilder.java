package videogame.characterbuilder;

public interface CharacterBuilder {
    void name();
    void race();
    void type();
    void equipment();
    void appereance();
    void abilities();
    Character getCharacter();
}
