package exemplos.Exemplo04;

import exemplos.PessoaPJ;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fulano" , "19 9 9999 1234", 20123);
        Pessoa p2 = new Pessoa("", "", 0);

        //p1.nome = "Fulano";
        //p1.cel = "19 9 9999 1234";
        p1.apresentar();

        p2.nome = "de tal";
        p2.cel = "19 3871 2198";
        p2.salario  =1000;
        p2.apresentar();

        System.out.println("Media = " + ((p1.salario + p2.salario) / 2));

        PessoaPJ empresa = new PessoaPJ("Itaú", "11.999.123/0001-01");
        empresa.nome = "Banco Itaú Unibanco S.A.";
        empresa.apresentar() ;
    }
}
