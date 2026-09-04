public class PersonagemManga {

    String nome;
    String serie;
    String tipo;
    int nivel;
    int vida;

    public PersonagemManga(String nome, String serie, String tipo, int nivel, int vida) {
        this.nome = nome;
        this.serie = serie;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
    }

    public void atacar(PersonagemManga inimigo) {
        int dano = nivel * 10;
        inimigo.vida = inimigo.vida - dano;
        System.out.println(nome + " atacou " + inimigo.nome + " causando " + dano + " de dano!");
        System.out.println(inimigo.nome + " ficou com " + inimigo.vida + " de vida.");
    }

    public void usarPoderEspecial() {
        System.out.println(nome + " usou seu poder especial!");
        nivel = nivel + 5;
        System.out.println("Nivel aumentou para: " + nivel);
    }

    public void exibirPerfil() {
        System.out.println("Nome: " + nome);
        System.out.println("Serie: " + serie);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
