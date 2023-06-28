package designpattern3_1;

public class CharacterCreator implements CharacterBuilder {

private Character character;
    public CharacterCreator() {
        this.character = new Character();
    }

    @Override
    public void race(String race) {
        character.setRace(race);
    }

    @Override
    public void type(String type) {
        character.setType(type);

    }

    @Override
    public void appearence(String appearance) {
        character.setAppearence(appearance);

    }

    @Override
    public void abilities(String abilities) {
        character.setAbilities(abilities);
    }

    @Override
    public void equip(String equip) {
        character.setEquip(equip);

    }

    @Override
    public Character getCharacter() {
        return character;
    }
}
