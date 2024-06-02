//Regra para o cálculo da média: [#00] - N1 e N2 = ADx2 + APx8; N = (N1 + N2)/2; Se N >=6 então NF = N senão NF = [(MAIOR (N1, N2) + AP3]/2

/*
 * Matérias:
 * álgebra linear
 * administração
 * humanidades e ciências sociais
 * desenho
 * estatística e probabilidade
 */
import java.util.Scanner;

 public class CalcularNotaFacul{
    public static double calcularN1(double ad1, double ap1){
        double n1;

        n1 = ((ad1 * 0.2) + (ap1 * 0.8));

        return n1;
    }
    public static double calcularN2(double ad2, double ap2){
        double n2 = 0;

        n2 = ((ad2 * 0.2) + (ap2 * 0.8));

        return n2;
    }
    public static double calcularN(double n1, double n2){
        double n;

        n = (n1+n2)/2;

        return n;
    }
    
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        double ad1 = 0F, ap1 = 0F, ad2 = 0F, ap2 = 0F, ap3 = 0F;

        System.out.println("Insira a nota da AD1: ");
        ad1 = scanner.nextDouble();
        System.out.println("\nInsira a nota da AP1: ");
        ap1 = scanner.nextDouble();
        System.out.println("\nInsira a nota da AD2: ");
        ad2 = scanner.nextDouble();
        System.out.println("\nInsira a nota da AP2: ");
        ap2 = scanner.nextDouble();
        System.out.println("Insira a nota da AP3: ");
        ap3 = scanner.nextDouble();

        System.out.println("\nSua N1 é: " + calcularN1(ad1, ap1));

        System.out.println("\nSua N2 é: " + calcularN2(ad2, ap2));

        System.out.println("\nSua N é: " + calcularN(calcularN1(ad1, ap1), calcularN2(ad2, ap2)));

        if (calcularN(ap2, ap3) >= 6) {
            System.out.println("\nAprovado !");            
        } else {
            System.out.println("\nFazer AP3 !");
        }
    }
}