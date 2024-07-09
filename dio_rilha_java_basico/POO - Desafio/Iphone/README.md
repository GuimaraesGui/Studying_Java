@startuml

interface ReprodutorMusical {
    +tocar(): void
    +pausar(): void
    +selecionarMusica(musica: String): void
}

class ReprodutorMusicalImpl {
    -musicaAtual: String
    +tocar(): void
    +pausar(): void
    +selecionarMusica(musica: String): void
}

ReprodutorMusical <|-- ReprodutorMusicalImpl

interface AparelhoTelefonico {
    +ligar(numero: String): void
    +atender(): void
    +iniciarCorreioVoz(): void
}

class AparelhoTelefonicoImpl {
    +ligar(numero: String): void
    +atender(): void
    +iniciarCorreioVoz(): void
}

AparelhoTelefonico <|-- AparelhoTelefonicoImpl

interface NavegadorInternet {
    +exibirPagina(url: String): void
    +adicionarNovaAba(): void
    +atualizarPagina(): void
}

class NavegadorInternetImpl {
    +exibirPagina(url: String): void
    +adicionarNovaAba(): void
    +atualizarPagina(): void
}

NavegadorInternet <|-- NavegadorInternetImpl

@enduml