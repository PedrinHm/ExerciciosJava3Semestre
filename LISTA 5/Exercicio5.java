import java.util.Scanner;

public class Exercicio5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("\nDigite uma palavra: ");
    String palavra1 = sc.next();

    System.out.printf("\nDigite uma palavra: ");
    String palavra2 = sc.next();

    int comparador = palavra1.compareTo(palavra2);
    if (comparador > 0) {
      System.out.printf("\n%s\n%s\n%d", palavra2, palavra1, comparador);
    } else if (comparador == 0) {
      System.out.printf("As palavras são iguais.\n%s", palavra1);
    } else {
      System.out.printf("%s\n%s\n%d", palavra1, palavra2, comparador);
    }

  }
}
