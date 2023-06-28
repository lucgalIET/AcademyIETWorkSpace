package Ciro.designpatter.albergo;

public class CameraSingola implements Camera {
    @Override
    public int numeroLetti() {
        return 1;
    }

    @Override
    public boolean lettoSingolo() {
        return true;
    }

    @Override
    public String vista() {
        return "Vista giardino";
    }

    @Override
    public boolean servizioInCamera() {
        return false;
    }

    @Override
    public boolean servizioPulizia() {
        return true;
    }

    @Override
    public boolean bagnoInCamera() {
        return false;
    }

    @Override
    public boolean animaliAmmessi() {
        return true;
    }
}
