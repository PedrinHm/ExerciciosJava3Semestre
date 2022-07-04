import java.util.Scanner;

public class Exercicio6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String login, nome;

    System.out.printf("Digite o endereço de email: ");
    login = sc.next();

    System.out.printf("Digite seu nome: ");
    nome = sc.next();

    int posicaoarroba = login.indexOf("@");
    if (posicaoarroba > 1) {
      int posicaoponto = login.indexOf(".");
      if (posicaoponto > 2) {
        System.out.printf("O email %s é valido.", login);
      } else {
        System.out.printf("Email %s é invalido.", login);
      }
    } else {
      System.out.printf("Email %s é invalido.", login);
    }

  }
}
