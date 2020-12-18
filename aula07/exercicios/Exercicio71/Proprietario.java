package exercicios.Exercicio71;

public class Proprietario {
    // atributos
    private String nome;
    private String telefone;

    // metodo construtor
    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Proprietario = [" + this.nome + ";" + this.telefone + "]";
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
