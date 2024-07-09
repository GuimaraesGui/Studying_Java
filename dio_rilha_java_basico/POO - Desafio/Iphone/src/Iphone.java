import Phone.Telefone;
import Internet.Safari;
import Ipod.Ipod;

public class Iphone {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        telefone.ligar("4002-8922");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println("\n");

        Ipod ipod = new Ipod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica("Rise");
        System.out.println("\n");

        Safari safari = new Safari();
        safari.exibirPagina("Google");
        safari.adicionarNovaAba();
        safari.atualizarPagina();
    }
}