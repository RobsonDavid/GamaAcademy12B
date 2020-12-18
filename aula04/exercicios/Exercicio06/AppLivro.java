package exercicios.Exercicio06;

public class AppLivro {
    public static void main(String[] args) {
        Livro bookx = new Livro("se correr o bicho pega", "Fulano", 10, 1);
/*
        System.out.println("Estou na página .... " + bookx.exibirPagina());
        bookx.setPagina(9);
        System.out.println("Estou na página .... " + bookx.exibirPagina());
        bookx.setPagina(11);
        System.out.println("Estou na página .... " + bookx.exibirPagina());
        bookx.mostrarCapa();
        bookx.avancarPagina();System.out.println("Estou na página .... " + bookx.exibirPagina());
        bookx.retrocederPagina();System.out.println("Estou na página .... " + bookx.exibirPagina());
*/
        Livro biblia = new Livro("Biblia Sagrada", "Apóstolos", 2530, 1);
        System.out.println("Estou na página .... " + biblia.exibirPagina());
        biblia.mostrarCapa();
        System.out.println("Estou na página .... " + biblia.exibirPagina());

        biblia.avancarPagina();System.out.println("Estou na página .... " + biblia.exibirPagina());
        biblia.avancarPagina();System.out.println("Estou na página .... " + biblia.exibirPagina());
        biblia.irParaPagina(1000);        
        System.out.println("Estou na página .... " + biblia.exibirPagina());

        biblia.retrocederPagina();        
        System.out.println("Estou na página .... " + biblia.exibirPagina());
        biblia.setAutor("Apóstos e outros colaboradores... ;-)");
        biblia.mostrarCapa();


    


    }
    
}
