package Construtores;

class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
        Pessoa pessoa = new Pessoa("231.131.600-63","Guilherme","Rua Paraguai, nº 104, Apto 101, Metrópole" );  
			
		System.out.println(pessoa.getNome() + " | " + pessoa.getCpf() + " | " + pessoa.getEndereco());
	}
}