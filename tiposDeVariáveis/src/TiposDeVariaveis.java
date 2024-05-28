public class TiposDeVariaveis {
    public double calcularAumento (double salario){
        double novoSalario;
        novoSalario = (salario*0.2);

        return novoSalario;
    }
    public static void main(String[] args) {
        String nome = "Guilherme";
        byte idade = 23;
        short anoNascimento = 2001;
        int cep = 26215170;
        long matricula = 23113160063L;
        float altura = 1.77F;
        double salario = 1350;

        System.out.print(nome + " - Tipo: String" + "\n");
        System.out.print(idade + " - Tipo: byte" + "\n");
        System.out.print(anoNascimento + " - Tipo: short" + "\n");
        System.out.print(cep + " - Tipo: int" + "\n");
        System.out.print(matricula + " - Tipo: long" + "\n");
        System.out.print(altura + " - Tipo: float" + "\n");
        System.out.print(salario + " - Tipo: double");

        System.out.println("\n");
        System.out.println("O novo salário será de: ");
    }
}

