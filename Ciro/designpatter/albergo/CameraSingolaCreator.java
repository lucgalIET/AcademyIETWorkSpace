package Ciro.designpatter.albergo;

public class CameraSingolaCreator extends CameraCreator {
    @Override
    public Camera creaCamera() {
        return new CameraSingola();
    }
}
