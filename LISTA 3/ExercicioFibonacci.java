import java.util.Scanner;

public class ExercicioFibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("----- Série de Fibonacci -----");
    System.out.println("Digite a quantidade de números para imprimir da série de Fibonacci: ");
    num = sc.nextInt();
    System.out.printf("Os %d primeiros números da série de Fibonacci:\n ", num);
    System.out.print("| ");
    for (int i = 1; i <= num; i++) {
      System.out.print(calculaFibonacci(i) + " | ");
    }
  }

  public static int calculaFibonacci(int num) {
    if (num == 1) {
      return 0;
    } else if (num == 2) {
      return 1;
    } else
      return calculaFibonacci(num - 1) + calculaFibonacci(num - 2);
  }
}