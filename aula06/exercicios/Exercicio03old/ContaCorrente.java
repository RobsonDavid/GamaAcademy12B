package exercicios.Exercicio03old;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.10;

public ContaCorrente(String numero) {
    super(numero);
}

    @Override
    public void sacar(double valor) {
        if (super.getSaldo() >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor){
        valor = valor - TAXA_DEPOSITO;
        super.depositar(valor);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Conta Corrente => " + super.getConta() + " => Saldo: " + super.getSaldo();
    }
}
