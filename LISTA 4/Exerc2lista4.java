public class Exerc2lista4 {

  public static void main(String args[]) {
    Funcionario novoFuncionario = new Funcionario();
    String nome = "Luis";
    String sobrenome = "Silva";
    int horasTrabalhadas = 10;
    double valorPorHora = 25.50;

    System.out.printf("\nNome completo: %s", novoFuncionario.nomeCompleto(nome, sobrenome));

    System.out.printf("\nSalario: %f", novoFuncionario.calcularSalario(horasTrabalhadas, valorPorHora));

    System.out.printf("\nHoras incrementadas: %d", novoFuncionario.incrementarHoras(horasTrabalhadas, 8));

    System.out.printf("\nNovo salario: %f",
        novoFuncionario.calcularSalario(novoFuncionario.incrementarHoras(horasTrabalhadas, 8), valorPorHora));

  }

  public static class Funcionario {
    String nome;
    String sobrenome;
    int horasTrabalhadas;
    float valorPorHora;

    String nomeCompleto(String n, String s) {
      String completo = n + " " + s;

      return completo;
    }

    double calcularSalario(int horas, double valor) {
      double salario = horas * valor;

      return salario;
    }

    int incrementarHoras(int horasTrabalhadas, int horasAdd) {
      int novasHoras = horasTrabalhadas + horasAdd;

      return novasHoras;
    }

  }

}
