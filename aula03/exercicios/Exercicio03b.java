package exercicios;
import java.util.Scanner;

public class Exercicio03b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // sequencia
        int num;

        System.out.println("Digite número:");
        num = teclado.nextInt();
        if (num > 0 ){
            System.out.print("Sequência impressa: ");
        } else {
            System.out.print("Valor inválido!");
        }

        int cont;
        cont = 1;
        while(((cont + cont) <= num) && num > 0) {
            System.out.printf("%d, ", cont);
            cont = cont + cont;
        }

        if (num > 0) {
            System.out.printf("%d", cont);
        }
        
        teclado.close();
    }
}