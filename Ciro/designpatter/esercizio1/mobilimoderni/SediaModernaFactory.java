package Ciro.designpatter.esercizio1.mobilimoderni;

public class SediaModernaFactory implements MobileModernoFactory {
    @Override
    public MobileModerno creaMobile() {
        return new SediaModerna();
    }
}
