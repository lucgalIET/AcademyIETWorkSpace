package manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobilimoderni;

public class TavoloModernoFactory implements MobileModernoFactory {

    @Override
    public MobileModerno creaMobile() {
        return new TavoloModerno();
    }
}
