public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.botaoLigar();

        smartTV.volumeUp();
        smartTV.volumeUp();
        smartTV.volumeUp();
        smartTV.volumeUp();
        smartTV.volumeUp();
        smartTV.volumeUp();

        smartTV.volumeDown();
        smartTV.volumeDown();
        smartTV.volumeDown();

        System.out.println("------------------");

        smartTV.definirCanal(1337);
        smartTV.canalDown();
        smartTV.canalDown();
        smartTV.canalDown();
        smartTV.canalDown();
        smartTV.canalDown();
        smartTV.canalUp();

        System.out.println("TV Ligada? -> " + smartTV.ligada);
        System.out.println("Canal Atual -> " + smartTV.canal);
        System.out.println("Volume Atual -> " + smartTV.volume);

    }
}
