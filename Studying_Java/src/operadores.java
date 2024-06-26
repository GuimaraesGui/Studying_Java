import java.util.Scanner;

public class operadores {   
    public static float calcularMedia(int a, int b, int c) {
        float media = (a+b+c)/3F;
        
        return media;
    }

    public static float somarDesvios(int a, int b, int c){
        float desvio1 = (calcularMedia(a, b, c)-a)*(calcularMedia(a, b, c)-a);
        float desvio2 = (calcularMedia(a, b, c)-b)*(calcularMedia(a, b, c)-b);
        float desvio3 = (calcularMedia(a, b, c)-c)*(calcularMedia(a, b, c)-c);
        float desvios = desvio1 + desvio2 + desvio3;

        return desvios;
    }

    public static float calcularVariancia(int a, int b, int c) {
        float variancia = somarDesvios(a, b, c)/2;

        return variancia;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int [] dados = new int[n];
        int a = 8, b = 15, c = 23;

        System.out.println("Quantos numeros? ");
        n = scanner.nextInt();

        System.out.println("Insira os 10 valores inteiros");  
        for(int i=0;i<n;i++){
            System.out.println("Valor " + (i+1) + ": ");
            dados[i] = scanner.nextInt();
        }


        System.out.println("Média: " + calcularMedia(a, b, c));
        System.out.println("\n");
        System.err.println("Soma dos desvio: " + somarDesvios(a, b, c));
        System.out.println("\n");
        System.out.println("Variância: " + calcularVariancia(a, b, c));
    }
}