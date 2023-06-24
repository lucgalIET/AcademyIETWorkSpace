package Ciro.designpatter.albergo;

public class CameraDoppiaCreator extends CameraCreator {
    @Override
    public Camera creaCamera() {
        return new CameraDoppia();
    }
}
