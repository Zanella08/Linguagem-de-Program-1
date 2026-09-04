import java.util.Scanner;

public class Ex6Viagem {

    public void executar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distancia em km:");
        double distancia = sc.nextDouble();

        System.out.println("Digite o consumo do carro (km por litro):");
        double consumo = sc.nextDouble();

        System.out.println("Digite o preco do combustivel:");
        double preco = sc.nextDouble();

        double litros = distancia / consumo;
        double custo = litros * preco;

        System.out.println("Litros necessarios: " + litros);
        System.out.println("Custo total: R$ " + custo);

    }

}
