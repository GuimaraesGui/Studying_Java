# Anotações de estudo sobre a linguagem Java.

## 1. Anatomia das Classes:
### 1.1. Sintaxe de declaração de uma nova classe

```Java
    public class MinhaClasse {
        //Estrutura do código.
        //app = nome do arquivo.
    }
```

Observações:

- Toda classe precisa de um nome, nesse caso **MinhaClass**;
- O nome do arquivo deve ser idêntico ao nome da **Public class**;
- Após o nome, definir o corpo **{ }**. É aqui que entram os **atributos** e **métodos**.
 
### 1.2. Saída de dados:
```Java
    public class app {
        public static void main (String[] args) throws Exception{
        System.out.println("Hello, world!");
        }
    }
```

Observações:

- **main** é o método.
- **(String [ ] args)** é o parâmetro / argumento.
- **{System.out.println()}**: Corresponde ao corpo da classe. <u>**Sua barreira ou limite é a Main**</u>, também chamada de **método**.
- ***Throws Exception*** é opcional.

### 1.3. Padrão de nomeclatura
**Arquivo *.java*:** Começar com a letra *MAIÚSCULA*. Se a palavra for composta a a segunda deve iniciar em *MAIÚSCULA* também.

**Nomeclatura de classe no arquivo:** A classe deve conter o mesmo nome do arquivo *.java*.

**Nome da variável:** Toda variável deve inicar com letra *MINÚSCULA*. Em caso de palavra composta, utilizar ***camelCase***.

**Algumas regras gerais para declaração de variáveis:**
- Deve conter apenas **letras**, **underline**, **S cifrão ( $ )** ou **os números de 0 até 9**.
- Nunca deve ser iniciado com número.
- Deve iniciar com letra *MINÚSCULA* (camelCase).
- Não pode conter espaços.
- Não pode utilizar palavras reservadas da linguagem de programação..
- O nome deve ser único dentro do escopo.

### Declaração de variáveis e métodos
**Modelo de declaração de variável em Java::**   

*Estrutura:*

    <Tipo> <NomeBemDefinido> = <Atribuição>; (É opcional em alguns casos)

*Exemplos*:

    int idade = 23;
    double altura = 1.62;
    Dog spike;

**Modelo de declaração de método em Java:**  
*Estrutura:*    

    <TipoRetorno> <NomeObjetivoNoInfinitivo> (Parametros)

*Exemplos:*

    int somar (int numeroUm, int numero2)

    String formatarCep (long cep)

## 2. Tipos de variáveis

### 2.1. Tipos primitivos e seus valores
|Tipo|Memória|Valor mínimo|Valor máximo|
|----|-------|------------|------------|
|byte|1 byte|-128|127|
|short|2 byte|-32.768|32.767|
|int|4 bytes|-2.147.483.648|2.147.483.647|
|long|8 bytes|-9.223.372.036.854.775.808|9.223.372.036.854.775.807|

### 2.2. Tipos primitivos fracionários
|Tipo|Memória|Valor mínimo|Valor máximo|Precisão|
|----|-------|------------|------------|--------|
|float|4 byte|-3,4028E + 38|3,4028E + 387|6 - 7 dígitos|
|double|8 byte|-1,7976E + 308|1,7976E + 308|15 dígitos|

### 2.3. Declaração de variáveis
A estrutura padrão é:

    <tipo> <nomeVariável> = <atribuiçãoDeValorOpcional>

Exemplos de declaração:

```Java
public class TiposDeVariaveis {
    public static void main(String[] args) {
        String nome = "Guilherme";
        byte idade = 23;
        short anoNascimento = 2001;
        int cep = 26215170;
        long matricula = 23113160063L;
        float altura = 1.77F;
        double salario = 1350;
    }
}
```

- O tipo **long** precisa da letra "L" no final do valor da variável para identificação do tipo;
- O tipo **float** precisa da letra "F" no final do valor da variável para identificação do tipo;

### 2.4. Variáveis e Constantes
Variáveis se modificam, já constantes não.

Exemplo:

```Java
public class Exemplo {
    public static void main(String[] args){
        int numero = 5;
        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;

        VALOR_DE_PI = 3.15;
    }
}
```

- A notação **final** sinaliza uma constante;
- Ao executar a última linha, estaremos diante de um erro, que indica justamente a impossibilidade de uma constante ser alterada;

## 3. Operadores
### 3.1. Operadores Aritméticos

Os operadores aritméticos são:
- **Soma**: +
- **Subtração**: -
- **Multiplicação**: *
- **Divisão**: /
- **Módulo**: %
  
Exemplo:
```Java
public class Exemplo {
    public static void main(String[] args){
        //classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
    }
}
```

### 3.2. Operadores unitários

Os operadores unitários são:

- **(+)**: Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
- **(-)**: Operador unário de valor negativo – nega um número ou expressão aritmética;
- **(++)** :Operador unário de incremento de valor – incrementa o valor em 1 unidade;
- **(--)**: Operador unário de decremento de valor – decrementa o valor em 1 unidade;
- **(!)**: Operador unário lógico de negação – nega o valor de uma expressão booleana;

Exemplo:
```Java
public class Exemplo{
    public static main(String[] args){
        int a = 5;

        a++; //Incrimenta a variável.
        a--; //Decrementa a variável.

        System.out.print(++a); //Incrimenta a variável antes dela ser impressa.
        System.out.print(a++); //Incrimenta a variável depois dela ser impressa.
        System.out.print(--a); //Decrementa a variável antes dela ser impressa.
        System.out.print(a--); //Incrimenta a variável depois dela ser impressa.
    }
}
```

### 3.3. Operadores ternários

O Operador de Condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores.

O operador ternário é representado pelos símbolos **?** e **:** utilizados na seguinte estrutura de sintaxe:

< Expressão Condicional> ? < Caso condição seja true> : < Caso condição seja false>

```Java
// classe Operadores.java
int a, b;

a = 5;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(valor);
```

### 3.4. Operadores relacionais

- **==**:  Quando desejamos verificar se uma variável é IGUAL A outra.
- **!=**: Quando desejamos verificar se uma variável é DIFERENTE da outra.
- **>**: Quando desejamos verificar se uma variável é MAIOR QUE a outra.
- **>=**: Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
- **<**: Quando desejamos verificar se uma variável é MENOR QUE outra.
- **<=**: Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

```Java
public class Exemplo{
    public static main(String[] args){
        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
	        System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
	        System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
        	System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
	        System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
	        System.out.print("Numero 1 é diferente de numero 2");jav
    }
}
```

- **O.B.S: Quando desejamos comparar objetos, utilizamos o método .equals().**

*Exemplo:*

```Java
// ComparacaoAvancada.java
 public static void main(String[] args) {
        
        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true
        
        Integer numero1 = 130;
        Integer numero2 = 130;

        System.out.println(numero1 == numero2); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
         System.out.println(numero1.equals(numero2)); 
 }
```

### 3.5. Operadores lógicos

- **&&**: Operador Lógico "E".
- **||**: Operador Lógico "OU".

*Exemplo*:

```Java
// Operadores.java
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");
```

## 4. Métodos
Os métodos correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes. Sendo assim, todas as
ações das aplicações são consideradas métodos.

### 4.1. Critério de nomeação de métodos
Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

- Deve ser nomeado como verbo.
- Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).
  
*Exemplo*:
```Java
public class Exemplo1(){
    somar(int n1, int n2){}

    abrirConexao(){}

    concluirProcessamento() {}

    findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

    calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade

    public static void main (String[] args){
        //Corpo do código.
    }
}
```

Abaixo temos um exemplo de uma classe com dois métodos e suas respectivas considerações:

```Java
public class MyClass {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}
	// throws Exception : indica que o método ao ser utilizado
	// poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{}
	
	// este método não pode ser visto por outras classes no projeto
	private void metodoPrivado(){}
	
	//alguns equívocos estruturais
	public void validar(){
		//este método deveria retornar algum valor
		//no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade
	}
	public void gravarCliente(String nome, String cpf, Integer telefone, ....){
		//este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
}
```

- **O.B.S.: ATENÇÃO! Não existe em Java o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.**
- **O.B.S: Caso o método não retorne nenhum valor, ele será representado pela palavra-chave void.**

*Exemplo 2*:

```Java
public class metodos {
    public static void saudacao(String nome){
        System.out.println("Seja bem-vindo, " + nome + " !");
    }
    public static void main(String[] args) {
        String nome = "Guilherme";
        
        saudacao(nome);
    }
}
```

## 5. Escopo



--- 
Referência bibliográfica:  
- [Documentação Java DIO.](https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/sintaxe/anatomia-das-classes)

<style>
    h1 {
        color: red;
    }
    h2 {
        color: blue;
    }
    h3 {
        color: green;
    }
    p {
        color: silver;
    }
    ul {
        color: yellow;
    }
</style>