public class SmartTV {

    boolean ligada = false;
    int canal = 1, volume = 15;

    public void botaoLigar() {
        if (ligada)
            ligada = false;
        else
            ligada = true;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public void canalUp() {
        canal++;
    }

    public void canalDown() {
        canal--;
    }

    public void definirCanal(int canalInput) {
        canal = canalInput;
    }

}
