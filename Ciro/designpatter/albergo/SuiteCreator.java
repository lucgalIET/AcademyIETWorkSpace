package Ciro.designpatter.albergo;

public class SuiteCreator extends CameraCreator {
    @Override
    public Camera creaCamera() {
        return new Suite();
    }
}
