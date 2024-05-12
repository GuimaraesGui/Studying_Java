# Anotações de estudo sobre a linguagem Java.
![logoJava](https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.stickersdevs.com.br%2Fshop%2Fstickers%2Fjava-sticker%2F&psig=AOvVaw2iDOuRHl8T23B7KgAxKknA&ust=1715106589187000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNDynorU-YUDFQAAAAAdAAAAABAE)

## 1. Anatomia das Classes:
### 1.1. Sintaxe de declaração de uma nova classe

```Java
    public class app {
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

     Tipo NomeBemDefinido = Atribuição; (É opcional em alguns casos)

*Exemplos*:

    int idade = 23;
    double altura = 1.62;
    Dog spike;

**Modelo de declaração de método em Java:**  
*Estrutura:*    

    TipoRetorno NomeObjetivoNoInfinitivo Parametros()

*Exemplos:*

    int somar (int numeroUm, int numero2)
    String formatarCep (long cep)

--- 
Referência bibliográfica:  
- [Documentação Java DIO.](https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/sintaxe/anatomia-das-classes)