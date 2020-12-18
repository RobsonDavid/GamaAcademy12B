package exemplos;

public class PessoaPJ {
    // atributo  - TODOS deveriam ser Privados
    public String nome;
    public String cnpj;


    // método construtor - TODOS deveriam ser Públicos!!!
    public PessoaPJ(String nome, String cnpj){
        this.nome = nome; // this - referencia o proprio objeto
        this.cnpj = cnpj;
    }


    // método
    public void apresentar(){
        System.out.println("Empresa <" + nome + ">. (CNPJ: " + cnpj + ")");
    }
}
