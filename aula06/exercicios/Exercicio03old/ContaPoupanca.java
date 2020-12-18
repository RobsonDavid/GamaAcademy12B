package exercicios.Exercicio03old;

public class ContaPoupanca extends Conta {
    // Atributo Classe
    private static double taxaSaque = 0.05; // 5%
    
    // Atributo Objeto
    //private double taxaSaque = 0.05; // 5%

    public ContaPoupanca(String conta) {
        super(conta);
    }

    // Atributo Objeto
    //public void setTaxaSaque(double tx) {
    
    // Atributo Classe    
    public static void setTaxaSaque(double tx) {
        if (tx > 0) {
            // Atributo Objeto
            //this.taxaSaque = tx;

            // atributo Classe
            taxaSaque = tx;
        }
    }

    @Override
    public void sacar(double valorSaque) {
        if ((valorSaque + (valorSaque * taxaSaque)) <= super.getSaldo()) {
            super.sacar(valorSaque * taxaSaque);
            super.sacar(valorSaque);
        } else {
            System.out.println("Saldo Insuficiente para saque");
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // return super.toString();
        return "Conta Poupança => " + super.getConta() + " => Saldo: " + super.getSaldo();
    }
}
