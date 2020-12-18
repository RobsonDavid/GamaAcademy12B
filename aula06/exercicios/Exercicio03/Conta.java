package exercicios.Exercicio03;

public abstract class Conta {
    private String numeroConta;
    private double saldo;

   /*  public Conta() {
        this.numeroConta = "Account_Number";
        this.saldo = 0;
    } */

    public Conta (String numero, double saldo){
        this.numeroConta = numero;
        this.saldo = saldo;
    }

    public Conta (String numero){
        this.numeroConta = numero;
        this.saldo = 0;
    }
    
    public String getConta() {
        return this.numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if (valor > 0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        //return super.toString();
        return "Conta: " + this.numeroConta + " => Saldo: " + this.saldo;
    }
}
