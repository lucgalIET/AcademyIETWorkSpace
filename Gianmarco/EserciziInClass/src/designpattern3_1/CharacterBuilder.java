package designpattern3_1;

public interface CharacterBuilder {

    void race(String race);

    void type(String type);

    void appearence(String app);
    void abilities(String abilities);

    void equip(String equip);
    Character getCharacter();

}
