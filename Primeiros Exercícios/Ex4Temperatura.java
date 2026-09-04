import java.util.Scanner;

public class Ex4Temperatura {

    public void executar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println(celsius + " graus Celsius equivale a:");
        System.out.println(fahrenheit + " Fahrenheit");
        System.out.println(kelvin + " Kelvin");

    }

}
