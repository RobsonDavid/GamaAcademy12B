package exercicios.Exercicio04;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(String numero, double limite) {
        super(numero);
        setLimite(limite);
    }

    public void setLimite (double limite) {
        if (limite >= 0 ){ 
            this.limite = limite;
        } else {
            System.out.println("Limite inválido");
        }
    }

    @Override
    public boolean sacar(double valorx){
        if (valorx <= (super.getSaldo() + this.limite) ) {
            return super.sacar(valorx);
        } else {
            //System.out.println("Valor Saque maior que disponível");
            return false;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        //return super.toString();
        return "Conta Especial => " + super.getConta() + " => Saldo: " + super.getSaldo();
    }
    
}
