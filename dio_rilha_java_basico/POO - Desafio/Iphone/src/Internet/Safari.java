package Internet;

public class Safari implements NavegadorInternet {
    public String exibirPagina(String url) {
       System.out.println("Exibindo a página: " + url);
       return url;
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
