import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ex1Multiplo ex1 = new Ex1Multiplo();
        Ex2Login ex2 = new Ex2Login();
        Ex3Compra ex3 = new Ex3Compra();
        Ex4Temperatura ex4 = new Ex4Temperatura();
        Ex5Camelos ex5 = new Ex5Camelos();
        Ex6Viagem ex6 = new Ex6Viagem();
        Ex7AluguelCarro ex7 = new Ex7AluguelCarro();

        int opcao = 0;

        while (opcao != 8) {

            System.out.println("Qual voce deseja executar?");
            System.out.println("1 - Verificacao de Multiplo");
            System.out.println("2 - Sistema de Login Simplificado");
            System.out.println("3 - Compra com desconto");
            System.out.println("4 - Temperatura");
            System.out.println("5 - Os trinta e cinco camelos");
            System.out.println("6 - Calculadora de viagem");
            System.out.println("7 - Aluguel de carro");
            System.out.println("8 - Sair");

            opcao = sc.nextInt();

            if (opcao == 1) {
                ex1.executar();
            } else if (opcao == 2) {
                ex2.executar();
            } else if (opcao == 3) {
                ex3.executar();
            } else if (opcao == 4) {
                ex4.executar();
            } else if (opcao == 5) {
                ex5.executar();
            } else if (opcao == 6) {
                ex6.executar();
            } else if (opcao == 7) {
                ex7.executar();
            } else if (opcao == 8) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opcao invalida!");
            }

        }

    }

}
