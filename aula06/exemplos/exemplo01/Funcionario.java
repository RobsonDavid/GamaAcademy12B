package exemplos.exemplo01;

/**
 * Funcionario
 */
public class Funcionario {
    private String nome;
    private double salario;

    // CONSTRUTOR
    public Funcionario(String nome, double salario){ 
     //this.nome = nome;
     setNome(nome);
     //this.salario = salario; 
     setSalario(salario);
    }

    // OVERLOAD - mesmo nome com tipo ou qtde parâmetros diferentes!
    public Funcionario() {

    }
    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 1045; // salario minimo
    }

    // MÉTODOS SET E GET
    public void setNome(String nome) {
        if (nome.length() <10) {
            System.out.println("Nome inválido");
        } else {
            this.nome = nome;
        }
        
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            System.out.println("Salario inválido");
        } else {
            this.salario = salario;
        }
    }

    public String getNome() {
        return nome;

    }

    public double getSalario() {
        return salario;
    }

    public String exibir() {
        return nome + " : " + salario;

    }

    public void aumentarSalario(double porcentagem) {
        salario = salario + (salario * porcentagem);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return exibir();
    }
}