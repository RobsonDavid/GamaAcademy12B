package exercicios.Exercicio06;

public class Livro {
    private String titulo, autor;
    private int totalPagina, paginaAtual;

    public Livro(String tituloLivro, String autorLivro, int totPaginasLivro, int paginaAtual) {
        //this.titulo = tituloLivro;
        setTitulo(tituloLivro);
        //this.autor = autorLivro;
        setAutor(autorLivro);
        this.totalPagina = totPaginasLivro;
        //this.paginaAtual = paginaAtual;
        setPagina(paginaAtual);
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void mostrarCapa() {
        this.paginaAtual = 0;
        System.out.println("Livro: " + titulo + "; Autor: " + autor + ".");
    }

    public void irParaPagina(int pag) {
        setPagina(pag);
    }

    public void setPagina(int pag){
        if ((pag <= totalPagina) && (pag > 0)){
            this.paginaAtual = pag;
        } else {
            System.out.println("Página inválida!");
        }
    }

    public void avancarPagina(){
        setPagina(paginaAtual+1);
    }

    public void retrocederPagina(){
        setPagina(paginaAtual-1);
    }

    public void setTitulo(String tituloLivro){
        if (tituloLivro.length() > 5){
            this.titulo = tituloLivro;
        } else {
            System.out.println("Titulo invalido!");
        }
    }

       public void setAutor (String autor){
           if (autor.length() > 5) {
               this.autor = autor;
           } else {
               System.out.println("Autor invalido!");
           }
       }
    
}
