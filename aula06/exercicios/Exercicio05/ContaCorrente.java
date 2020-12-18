package exercicios.Exercicio05;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.10;

public ContaCorrente(String numero) {
    super(numero);
}

    @Override
    public boolean sacar(double valor) {
        if (super.getSaldo() >= valor) {
            return super.sacar(valor);
        } else {
            //System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    @Override
    public boolean depositar(double valor){
        valor = valor - TAXA_DEPOSITO;
        return super.depositar(valor);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Conta Corrente => " + super.getConta() + " => Saldo: " + super.getSaldo();
    }
}
