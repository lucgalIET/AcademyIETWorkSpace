package perCasa.esercizi_22_06_2023.esercizio1;

import perCasa.esercizi_22_06_2023.esercizio1.Camera;

public class CameraDoppia implements Camera {
    @Override
    public int numeroLetti() {
        return 1;
    }

    @Override
    public boolean lettoSingolo() {
        return false;
    }

    @Override
    public String vista() {
        return "Vista giardino";
    }

    @Override
    public boolean servizioInCamera() {
        return true;
    }

    @Override
    public boolean servizioPulizia() {
        return true;
    }

    @Override
    public boolean bagnoInCamera() {
        return true;
    }
}
