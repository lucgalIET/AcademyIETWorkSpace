package perCasa.esercizi_22_06_2023.esercizio1;

import perCasa.esercizi_22_06_2023.esercizio1.Camera;
import perCasa.esercizi_22_06_2023.esercizio1.CameraCreator;
import perCasa.esercizi_22_06_2023.esercizio1.CameraSingola;

public class CameraSingolaCreator extends CameraCreator {
    @Override
    public Camera creaCamera() {
        return new CameraSingola();
    }
}