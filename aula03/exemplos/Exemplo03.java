package exemplos;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int valor;
       int soma = 0;
       int cont;
       cont = 1;
       soma = 0;
       final int limite = 4; // constante

       while (cont < limite) {
        System.out.println("Digite o valor: ");
        valor = teclado.nextInt();
        cont++;
        soma += valor;
       }
        
       System.out.println("Soma= " + soma);
        
       teclado.close();
    }
}
