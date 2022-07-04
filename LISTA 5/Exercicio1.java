import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String login, senha;

    System.out.printf("Digite o endereço de email: ");
    login = sc.next();

    System.out.printf("Digite a senha: ");
    senha = sc.next();

    if (login.equals("ln") && senha.equals("corporation")) {
      System.out.printf("\nLogin aceito.");
      System.out.printf("\nSenha aceita.");
      System.out.println("\nUsuário autenticado no sistema.");
    } else {
      System.out.printf("\nFalha na autenticação.");
    }
  }
}