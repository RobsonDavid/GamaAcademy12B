package exercicios;

import java.util.Scanner;

public class Exercico01 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int n;

        //n = 50;
        System.out.println("Digite um número........: ");
        n = teclado.nextInt();
        System.out.println("Número = " + n);
        if (numpar(n)) {
            System.out.println("Número PAR!!");
        } else {
            System.out.println("Número ÍMPAR....");
        }

        teclado.close();

    }

    public static boolean numpar(int num) {
        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
