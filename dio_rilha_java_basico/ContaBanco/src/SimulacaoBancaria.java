import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            
            //System.out.println("1.Depositar\n2.Sacar\n3.Consultar Saldo\n0.Encerrar\n");
            int opcao = scanner.nextInt();
            //System.out.println("\n");

            switch (opcao) {
                
                case 1:     
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    //System.out.println("Valor a depositar: ");
                    double novoSaldo = scanner.nextDouble();

                    saldo = saldo + novoSaldo;

                    System.out.printf("Saldo atual: %.1f\n", novoSaldo);
                    //System.out.println("\n_____________");
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    double valorSaque = scanner.nextDouble();
                    if(saldo >= valorSaque){
                        saldo = saldo - valorSaque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                        //System.out.println("\n_____________");
                        //System.out.println("\n");
                    } else {
                        System.out.println("Saldo insuficiente.\n");
                        //System.out.println("\n_____________");
                    }

                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    //System.out.println("\n_____________");
                    //System.out.println("\n");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    //System.out.println("\n_____________");
                    //System.out.println("\n");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    //System.out.println("\n");
            }
        }
        scanner.close();
    }
}