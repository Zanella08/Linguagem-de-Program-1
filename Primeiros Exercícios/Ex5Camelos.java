public class Ex5Camelos {

    public void executar() {

        int totalCamelos = 35;

        // o sabio empresta 1 camelo, ficam 36
        int camelos = totalCamelos + 1;

        int filho1 = camelos / 2;  // metade
        int filho2 = camelos / 3;  // um terco
        int filho3 = camelos / 9;  // um nono

        System.out.println("Total de camelos com o do sabio: " + camelos);
        System.out.println("Filho mais velho recebe (metade): " + filho1);
        System.out.println("Filho do meio recebe (um terco): " + filho2);
        System.out.println("Filho mais novo recebe (um nono): " + filho3);
        System.out.println("Total distribuido: " + (filho1 + filho2 + filho3));
        System.out.println("O sabio recupera o seu camelo!");

    }

}
