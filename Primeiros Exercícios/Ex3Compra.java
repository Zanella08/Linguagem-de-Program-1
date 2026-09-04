import java.util.Scanner;

public class Ex3Compra {

    public void executar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valor = sc.nextDouble();

        double desconto = 0;
        double valorFinal = 0;

        if (valor < 100) {
            desconto = 0;
        } else if (valor < 500) {
            desconto = valor * 0.05;
        } else if (valor < 1000) {
            desconto = valor * 0.10;
        } else {
            desconto = valor * 0.15;
        }

        valorFinal = valor - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

    }

}
