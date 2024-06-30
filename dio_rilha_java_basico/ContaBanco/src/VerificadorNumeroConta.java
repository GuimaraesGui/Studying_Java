import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String numeroConta = scanner.nextLine();
            // TODO: Chamar o método que veritica se o número da conta é valido
            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            verificarNumeroConta(numeroConta);
        } catch (IllegalArgumentException e) {
            // TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
            System.err.println(e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // TODO: Lançar uma IllegalArgumentException com a seguinte mensagem:
            // "Numero de conta invalido. Digite exatamente 8 digitos."
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos");
        } else {
            System.out.println("Numero de conta valido.");
        }
    }
}