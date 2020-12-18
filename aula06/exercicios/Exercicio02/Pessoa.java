package exercicios.Exercicio02;

//public class  Pessoa {
abstract class  Pessoa {
    private String nome, telefone;
    // protect - que public e + private
    protected String rg;
    
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.rg = "22.06906-2";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // era... return super.toString();
        return "[" + nome + "] - (" + telefone + ")";

    }
}
