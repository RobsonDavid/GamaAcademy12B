package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {
    public static void main(String[] args) {
        //System.out.println("-------------");
        linha("......abc.....");
        System.out.println("Fala Galera!!");
        linhaPequena();
        //System.out.println("..-----------");
         System.out.println("v1.0");
         //linhaPequena();
         linhaVariavel(04 , '_');
    }

    public static void linha (String preencher) {
        System.out.printf("%s\n", preencher);
    }

    public static void linhaPequena () {
        System.out.println("----");
    }

    public static void linhaVariavel (int tam, char texto) {
        for(int i=1;i<=tam;i++){
            System.out.printf("%c", texto);
        }
        System.out.println();
    }
}