package manuel.eserciziacasa.esercizicreationaldp.esercizio1.mobilimoderni;

public class DivanoModernoFactory implements MobileModernoFactory{
    @Override
    public MobileModerno creaMobile() {
        return new DivanoModerno();
    }
}
