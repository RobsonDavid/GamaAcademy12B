package exercicios.Exercicio02;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String telefone, double salario) {
        super(nome, telefone);
        this.salario = salario;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // era ...return super.toString();
        return super.toString() + " - {" + salario + "}";
    }
}
