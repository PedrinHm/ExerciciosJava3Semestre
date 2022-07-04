import java.util.Scanner;;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("\nDigite uma frase: ");
    String frase = sc.nextLine();

    frase = frase.replace('a', 'b');

    System.out.printf("Nova frase: %s", frase);
  }
}