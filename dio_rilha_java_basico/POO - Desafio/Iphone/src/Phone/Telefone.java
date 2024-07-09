package Phone;

public class Telefone implements AparelhoTelefonico {
    public String ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
        return numero;
    }
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }
}
