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

## 1.3. Padrão de nomeclatura
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

## Declaração de variáveis e métodos
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

        System.out.print(nome + " - Tipo: String" + "\n");
        System.out.print(idade + " - Tipo: byte" + "\n");
        System.out.print(anoNascimento + " - Tipo: short" + "\n");
        System.out.print(cep + " - Tipo: int" + "\n");
        System.out.print(matricula + " - Tipo: long" + "\n");
        System.out.print(altura + " - Tipo: float" + "\n");
        System.out.print(salario + " - Tipo: double");
    }
}
```

- O tipo **long** precisa da letra "L" no final do valor da variável para identificação do tipo;
- O tipo **float** precisa da letra "F" no final do valor da variável para identificação do tipo;

### Variáveis e Constantes
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

--- 
Referência bibliográfica:  
- [Documentação Java DIO.](https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/sintaxe/anatomia-das-classes)

<style>
    h1 {
        color: red;
    }
    h2 {
        color: green;
    }
    h3 {
        color: blue;
    }
    p {
        color: ;
    }
    ul {
        color: yellow;
    }
</style>