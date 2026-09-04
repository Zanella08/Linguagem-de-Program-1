import java.util.Scanner;

public class Ex7AluguelCarro {

    public void executar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a categoria do carro:");
        System.out.println("1 - Economico (R$ 80 por dia)");
        System.out.println("2 - Intermediario (R$ 120 por dia)");
        System.out.println("3 - Luxo (R$ 250 por dia)");

        int categoria = sc.nextInt();

        System.out.println("Digite a quantidade de dias:");
        int dias = sc.nextInt();

        double total = 0;

        if (categoria == 1) {
            total = dias * 80;
        } else if (categoria == 2) {
            total = dias * 120;
        } else if (categoria == 3) {
            total = dias * 250;
        } else {
            System.out.println("Categoria invalida!");
        }

        System.out.println("Total a pagar: R$ " + total);

    }

}
