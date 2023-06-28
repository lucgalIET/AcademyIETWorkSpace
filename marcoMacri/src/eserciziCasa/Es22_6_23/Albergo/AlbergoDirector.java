package marcoMacri.src.eserciziCasa.Es22_6_23.Albergo;

public class AlbergoDirector {

    public AlbergoBuilder
            albergoBuilder;

    public AlbergoDirector(AlbergoBuilder albergoBuilder) {
        this.albergoBuilder = this.albergoBuilder;
    }

    public Albergo constructorStanza(){
        albergoBuilder.prezzoStanza();
        albergoBuilder.numeroStanza();
        albergoBuilder.tipoStanza();
        return albergoBuilder.getStanza();
    }

}
