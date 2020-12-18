package exercicios.Exercicio03old;

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

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor > 0) {
            this.saldo -= valor;
        }
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        //return super.toString();
        return "Conta: " + this.numeroConta + " => Saldo: " + this.saldo;
    }
}
