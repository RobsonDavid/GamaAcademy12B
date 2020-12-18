package exercicios.Exercicio71;

public class Animal {
    // atributos
    private String nome;
    private String raca;
    private String cor;
    private int ano;
    private Proprietario dono;

   
	// metodo construtor
    public  Animal (String nome, String raca, String cor, int ano, String nomeDono, String telefoneDono){
        this.nome = nome;
        this.raca = raca;
        this.cor  = cor ; 
        this.ano  = ano;
        this.dono = new Proprietario(nomeDono, telefoneDono);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Animal: {" + this.nome + " ; " + this.raca + " ; " + this.cor + " ; " + this.ano + " ; " +  this.dono +"}";
    }

    public String getDono () {
        return dono.toString();
    }

    public Proprietario getDonoObjeto(){
        return dono;
    }

    

    public String getNome() {
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }
}
