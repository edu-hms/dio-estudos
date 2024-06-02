public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(34);
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
        
        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
    }
}
