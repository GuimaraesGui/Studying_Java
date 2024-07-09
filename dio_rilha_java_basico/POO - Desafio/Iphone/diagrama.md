# Projeto iPhone

Este projeto modela as funcionalidades de um iPhone com classes para Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

````mermaid
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