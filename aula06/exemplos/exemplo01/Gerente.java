package exemplos.exemplo01;

public class Gerente extends Funcionario {
private int nFuncionarios;

public Gerente(String nome, double salario, int nFuncionarios){
    // referencia ao construtor da classe
    super(nome, salario);  
    this.nFuncionarios = nFuncionarios;
}

// OVERHIDE  - trocou o que faz para o gerente 1o na classe e depois sa Super Calsse
@Override
public void aumentarSalario(double porcentagem) {
    //salario = salario + salario * (porcentagem * 0.20);}
}

@Override
public String exibir() {
    // TODO Auto-generated method stub
    return super.exibir() +  " --> " + nFuncionarios;
}

public String exbirGerente() {
    //return super.getNome() + " : " + super.getSalario() + " : " + nFuncionarios;
    //return (String) nFuncionarios; //erro
    return "abc";
}

public int getNFuncionario () {
    return this.nFuncionarios;
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return exibir();
}
    
}
