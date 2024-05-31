import java.util.Scanner;

public class InputExemplo {
    public static void main(String[] args) {
        // Passo 1: Criar uma instância do Scanner
        Scanner scanner = new Scanner(System.in);

        // Passo 2: Pedir ao usuário para inserir um nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Passo 3: Pedir ao usuário para inserir a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Passo 4: Exibir as informações
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        // Passo 5: Fechar o Scanner
        scanner.close();
    }
}
