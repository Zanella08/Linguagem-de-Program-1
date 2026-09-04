public class PontoTuristico {

    String nome;
    String cidade;
    String pais;
    int anoInauguracao;
    int numeroVisitantes;

    public PontoTuristico(String nome, String cidade, String pais, int anoInauguracao, int numeroVisitantes) {
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
        this.anoInauguracao = anoInauguracao;
        this.numeroVisitantes = numeroVisitantes;
    }

    public void receberVisitantes(int quantidade) {
        numeroVisitantes = numeroVisitantes + quantidade;
        System.out.println("Novos visitantes recebidos! Total agora: " + numeroVisitantes);
    }

    public double calcularMediaPorDia() {
        double media = numeroVisitantes / 365.0;
        return media;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Pais: " + pais);
        System.out.println("Ano de inauguracao: " + anoInauguracao);
        System.out.println("Numero de visitantes: " + numeroVisitantes);
        System.out.println("Media por dia: " + calcularMediaPorDia());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnoInauguracao() {
        return anoInauguracao;
    }

    public void setAnoInauguracao(int anoInauguracao) {
        this.anoInauguracao = anoInauguracao;
    }

    public int getNumeroVisitantes() {
        return numeroVisitantes;
    }

    public void setNumeroVisitantes(int numeroVisitantes) {
        this.numeroVisitantes = numeroVisitantes;
    }

}
