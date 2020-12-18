package exercicios.Exercicio02;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String telefone, String curso) {
        super(nome, telefone);
        this.curso = curso ;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // era return super.toString();
        return super.toString() + " - <" + curso + ">   |= RG: " + super.rg + " =|";
    }
    
}
