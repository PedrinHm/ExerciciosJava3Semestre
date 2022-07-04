import java.util.Scanner;

public class Atividade1_ {
  public static int fatorial(int num) {
    if (num == 0) {

      return 1;

    } else {
      return fatorial(num - 1) * num;
    }

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero");
    int numero = sc.nextInt();

    System.out.println(fatorial(numero));

  }
}