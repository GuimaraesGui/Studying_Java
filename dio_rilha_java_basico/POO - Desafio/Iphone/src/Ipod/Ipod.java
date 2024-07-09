package Ipod;

public class Ipod implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música.");
    }
    public void pausar() {
        System.out.println("Pausando música.");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }

}
