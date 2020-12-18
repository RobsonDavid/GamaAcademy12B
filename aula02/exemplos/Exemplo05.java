package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        int pontos;
        int chaves;
        boolean abrirPorta1, abrirPorta2;

        pontos = 1000;
        chaves = 2;

        abrirPorta1 = (pontos >= 1000) && (chaves > 0);
        abrirPorta2 = (pontos > 1000) || (chaves >= 2);

        if ((!abrirPorta1) && (!abrirPorta2)) {
            System.out.println("Não vou abrir portas!");
        } else {
            System.out.println("Vou abrir porta(s).");
        }
        if (abrirPorta1) {
            System.out.println("Abriu Porta 1");
        }
        if (abrirPorta2) {
            System.out.println("Abriu Porta 2");
        }

    }
}
