import java.util.Scanner;

public class Ex2Login {

    public void executar() {

        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.println("Digite o usuario:");
        String usuario = sc.next();

        System.out.println("Digite a senha:");
        String senha = sc.next();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login efetuado com sucesso!");
        } else {
            System.out.println("Usuario ou senha incorretos!");
        }

    }

}
