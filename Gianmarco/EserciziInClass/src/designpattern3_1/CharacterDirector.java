package designpattern3_1;

public class CharacterDirector {
    private CharacterBuilder characterBuilder;


    public CharacterDirector(CharacterBuilder characterBuilder) {
        this.characterBuilder = characterBuilder;
    }

    public void createCharacter(String race, String characterClass, String appearance, String equip, String abilities) {
        characterBuilder.race(race);
        characterBuilder.type(characterClass);
        characterBuilder.appearence(appearance);
        characterBuilder.equip(equip);
        characterBuilder.abilities(abilities);
    }
    public Character getCharacter(){
        return characterBuilder.getCharacter();
    }

}
