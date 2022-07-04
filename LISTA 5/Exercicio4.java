import java.util.Scanner;

public class Exercicio4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("\nEscreva o seu nome completo: ");
    String nome = sc.nextLine();
    int posicao = nome.indexOf(" ");
    String sobrenome = nome.substring(posicao + 1, nome.length());
    System.out.println("Sobrenome: " + sobrenome);

  }
}