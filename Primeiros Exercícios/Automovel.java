public class Automovel {

    String marca;
    String modelo;
    int ano;
    String cor;
    double velocidade;

    public Automovel(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = 0;
    }

    public void acelerar(double valor) {
        velocidade = velocidade + valor;
        System.out.println("Acelerando... velocidade atual: " + velocidade + " km/h");
    }

    public void frear(double valor) {
        velocidade = velocidade - valor;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Freando... velocidade atual: " + velocidade + " km/h");
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

}
