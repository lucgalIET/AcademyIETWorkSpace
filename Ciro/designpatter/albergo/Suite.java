package Ciro.designpatter.albergo;

public class Suite implements Camera {
    @Override
    public int numeroLetti() {
        return 2;
    }

    @Override
    public boolean lettoSingolo() {
        return false;
    }

    @Override
    public String vista() {
        return "Vista mare";
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

    @Override
    public boolean animaliAmmessi() {
        return false;
    }
}
