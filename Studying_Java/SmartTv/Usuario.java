public class Usuario {
    public static void imprimirLinha(){
        System.out.println("____________________________________");
    }
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); //Orientação a objetos: forma de mostrar a interação entre classe e objeto.
        
        System.out.println("TV ligada?" + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        imprimirLinha();

        smartTv.ligar();
        System.out.println("NOVO Status - TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("NOVO Volume: " + smartTv.volume);

        smartTv.passarCanal();
        System.out.println("NOVO Canal: " + smartTv.canal);
    }
}