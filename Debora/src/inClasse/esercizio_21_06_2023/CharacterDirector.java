package inClasse.esercizio_21_06_2023;

public class CharacterDirector {
    private CharacterBuilder characterBuilder;

    public CharacterDirector(CharacterBuilder characterBuilder) {
        this.characterBuilder = characterBuilder;
    }

    public Character characterBuilder() {
        characterBuilder.choseName();
        characterBuilder.choseRace();
        characterBuilder.choseType();
        characterBuilder.appearence();
        characterBuilder.equip();
        characterBuilder.abilities();
        return characterBuilder.getCharacter();
    }


}
