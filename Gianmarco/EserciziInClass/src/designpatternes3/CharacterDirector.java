package designpatternes3;

public class CharacterDirector  {
    private CharacterBuilder characterBuilder;

    public CharacterDirector(CharacterBuilder characterBuilder) {
        this.characterBuilder = characterBuilder;
    }

    public Character characterBuilder(){
       characterBuilder.choseName("");
       characterBuilder.choseType();
       characterBuilder.choseRace();

    }
}
