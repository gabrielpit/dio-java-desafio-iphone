// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

// Classe que representa o iPhone e implementa as interfaces relevantes
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar() {
        // Implementação para tocar música
        System.out.println("Tocando Musica");;
    }
    public void pausar() {
        // Implementação para pausar música
        System.out.println("Pausando Musica");
    }
    public void selecionarMusica(String musica) {
        // Implementação para selecionar uma música
        System.out.println("Selecionando musica");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void ligar(String numero) {
        // Implementação para realizar uma chamada
        System.out.println("Chamando");
    }
    public void atender() {
        // Implementação para atender uma chamada
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz() {
        // Implementação para iniciar o correio de voz
        System.out.println("Iniciando correio de voz");
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
        // Implementação para exibir uma página na internet
        System.out.println("Exibindo pagina web");
    }
    public void adicionarNovaAba(String url) {
        // Implementação para adicionar uma nova aba no navegador
        System.out.println("Abrindo nova aba");
    }
    public void atualizarPagina() {
        // Implementação para atualizar a página no navegador
        System.out.println("Atualizando pagina");
    }
}