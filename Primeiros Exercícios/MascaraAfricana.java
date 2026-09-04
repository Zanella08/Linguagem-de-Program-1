public class MascaraAfricana {

    String etnia;
    String material;
    String finalidade;
    int anoFabricacao;
    double preco;

    public MascaraAfricana(String etnia, String material, String finalidade, int anoFabricacao, double preco) {
        this.etnia = etnia;
        this.material = material;
        this.finalidade = finalidade;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    public void restaurar() {
        preco = preco * 1.20;
        System.out.println("Mascara restaurada! Novo preco: R$ " + preco);
    }

    public void verificarIdade() {
        int idade = 2025 - anoFabricacao;
        System.out.println("A mascara tem " + idade + " anos.");
        if (idade > 100) {
            System.out.println("E uma peca historica!");
        } else {
            System.out.println("E uma peca mais recente.");
        }
    }

    public void exibirDados() {
        System.out.println("Etnia: " + etnia);
        System.out.println("Material: " + material);
        System.out.println("Finalidade: " + finalidade);
        System.out.println("Ano de fabricacao: " + anoFabricacao);
        System.out.println("Preco: R$ " + preco);
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
