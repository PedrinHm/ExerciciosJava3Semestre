import java.util.Scanner;;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("\nDigite uma frase: ");
    String frase = sc.nextLine();

    frase = frase.replace(" ", "");

    System.out.printf("Nova frase: %s", frase);
  }
}