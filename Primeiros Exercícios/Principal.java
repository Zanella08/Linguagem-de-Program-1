public class Principal {

    public static void main(String[] args) {

        // testando a classe Automovel
        System.out.println("=== Teste Automovel ===");

        Automovel carro1 = new Automovel("Ford", "Ka", 2020, "Vermelho");
        carro1.exibirDados();

        System.out.println();
        carro1.acelerar(50);
        carro1.acelerar(30);
        carro1.frear(20);

        System.out.println();
        Automovel carro2 = new Automovel("Fiat", "Uno", 2018, "Branco");
        carro2.exibirDados();

        System.out.println();

        // testando a classe PontoTuristico
        System.out.println("=== Teste PontoTuristico ===");

        PontoTuristico ponto1 = new PontoTuristico("Cristo Redentor", "Rio de Janeiro", "Brasil", 1931, 2000000);
        ponto1.exibirInformacoes();

        System.out.println();
        ponto1.receberVisitantes(5000);

        System.out.println();
        PontoTuristico ponto2 = new PontoTuristico("Coliseu", "Roma", "Italia", 80, 7000000);
        ponto2.exibirInformacoes();

        System.out.println();

        // testando a classe MascaraAfricana
        System.out.println("=== Teste MascaraAfricana ===");

        MascaraAfricana mascara1 = new MascaraAfricana("Yoruba", "Madeira", "Ritual", 1890, 15000);
        mascara1.exibirDados();

        System.out.println();
        mascara1.verificarIdade();
        mascara1.restaurar();

        System.out.println();
        MascaraAfricana mascara2 = new MascaraAfricana("Bamileke", "Bronze", "Cerimonia", 2000, 3000);
        mascara2.exibirDados();
        mascara2.verificarIdade();

        System.out.println();

        // testando a classe PersonagemManga
        System.out.println("=== Teste PersonagemManga ===");

        PersonagemManga personagem1 = new PersonagemManga("Naruto", "Naruto", "Heroi", 9, 1000);
        PersonagemManga personagem2 = new PersonagemManga("Sasuke", "Naruto", "Rival", 8, 900);

        personagem1.exibirPerfil();
        System.out.println();
        personagem2.exibirPerfil();

        System.out.println();
        personagem1.atacar(personagem2);
        System.out.println();
        personagem2.usarPoderEspecial();
        System.out.println();
        personagem2.atacar(personagem1);

    }

}
