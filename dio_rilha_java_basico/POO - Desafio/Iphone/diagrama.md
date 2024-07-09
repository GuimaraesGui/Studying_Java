![Diagrama UML](C:/Users/00805129/OneDrive - NATURGY INFORMATICA S.A/Escritorio/Java Projects/dio_rilha_java_basico/POO - Desafio/Iphone/POO - Desafio-2024-07-09-152225.png)
![Diagrama UML](caminho/para/sua/imagem.png)



classDiagram
    class ReprodutorMusical {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class Iphone {
        +ReprodutorMusical reprodutorMusical
        +AparelhoTelefonico aparelhoTelefonico
        +NavegadorInternet navegadorInternet
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet