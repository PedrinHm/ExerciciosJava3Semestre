public class Exerc1lista4 {

  public static void main(String[] args) {
    Contacorrente novaConta = new Contacorrente();

    novaConta.saldo = 0;

    novaConta.definirSaldoInicial(1000);

    novaConta.sacar(500);

    novaConta.depositar(50);

    novaConta.sacar(600);

  }

  public static class Contacorrente {
    float saldo;

    void definirSaldoInicial(float valor) {
      saldo = valor;

      System.out.printf("\nSaldo inicial: %f\n", saldo);
    }

    void depositar(float valor) {
      saldo += valor;

      System.out.printf("\nDeposito concluido.\nSaldo atualizado: %f\n", saldo);
    }

    void sacar(float valor) {
      if (valor <= saldo) {
        saldo -= valor;

        System.out.printf("\nSaque concluido.\nSaldo atualizado: %f\n", saldo);
      } else {
        System.out.printf("\nNão foi possivel completar o saque.\nSaldo indisponivel: %f\n", saldo);
      }

    }

  }

}