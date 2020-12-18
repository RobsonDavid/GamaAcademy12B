package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        // n = 50;
        System.out.println("Digite um número........: ");
        n = teclado.nextInt();
        System.out.println("Número = " + n);

        System.out.println("Número " + numparimpar(n));

        numeroe(n);

        teclado.close();

    }

    public static String numparimpar(int num) {
        if ((num % 2) == 0) {
            return "PAR";
        } else {
            return "ÍMPAR";
        }
    }

   public static void numeroe (int xpto) {
        if ((xpto % 2) == 0) {
            System.out.println("Numero é... PAR!");
        } else 
        {
            System.out.println("Numero é.....ÍMPAR");
        }
   }
}
