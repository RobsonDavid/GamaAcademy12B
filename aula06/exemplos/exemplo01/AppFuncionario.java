package exemplos.exemplo01;

public class AppFuncionario {
    public static void main(String[] args) {
        // Conceitos de Herança
        Funcionario f = new Funcionario("Aparecido da Silva Sauro", 1000);
        Gerente g = new Gerente("Antonio Coutinho", 3000, 1);

        //f.setNome("Robson Eduardo David");
        f.setSalario(25123);
        System.out.println(f.exibir());
        

        //g.setNome("Antonio Coutinho");
        g.setSalario(f.getSalario() * 2);
        System.out.println(g.exibir());
        //System.out.println(g.exbirGerente()); // erro
        //System.out.println( (String) g.getNFuncionario() ); // erro ?

// seleciona o bloco, depois ALT SHIFT A - comenta/descomenta tudo
/*         Funcionario func1 = new Funcionario();
        func1.setNome("João Maria Pereira");
        func1.setSalario(25123);
        System.out.println(func1.exbir());

        Funcionario func2 = new Funcionario("Jõao do pé de feijão");
        func2.setSalario(10987);
        System.out.println(func2.exbir());
 */        


        // herdou Object e default .toString
        // fazendo Overide em objeto funcionario e gerente
        System.out.println(f);
        System.out.println(g);
    }
    
    
}
