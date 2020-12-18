package exemplos.Exemplo04;

public class Pessoa {
    // atributo  - TODOS deveriam ser Privados
    String nome;
     String cel;
    float salario;


    // método construtor - TODOS deveriam ser Públicos!!!
    Pessoa(String nome, String celpar, float salario){
        this.nome = nome; // this - referencia o proprio objeto
        cel = celpar;
        this.salario = salario;
    }


    // método
    void apresentar(){
        System.out.println("Meu nome é " + nome + ". Segue meu celular " + cel + ", me liga! ;-)");
    }
}
