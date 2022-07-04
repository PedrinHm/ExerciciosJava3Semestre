import java.util.Scanner;

public class Exercicio1fibInt {

  public static int calculaFibonacci(int n) {
    int F = 0;
    int ant = 0;

    for (int i = 1; i <= n; i++) {

      if (i == 1) {
        F = 1;
        ant = 0;
      } else {
        F += ant;
        ant = F - ant;
      }
    }
    return F;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("----- Série de Fibonacci -----");
    System.out.println("Digite a quantidade de números para imprimir da série de Fibonacci: ");
    int num = sc.nextInt();
    System.out.printf("Os %d primeiros números da série de Fibonacci:\n ", num);
    for (int i = 0; i < num; i++) {
      System.out.print(calculaFibonacci(i) + " | ");

    }
  }
}
