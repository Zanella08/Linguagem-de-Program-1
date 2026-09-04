import java.util.Scanner;

public class Ex1Multiplo {

    public void executar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " e multiplo de " + numero2);
        } else {
            System.out.println(numero1 + " nao e multiplo de " + numero2);
        }

    }

}
