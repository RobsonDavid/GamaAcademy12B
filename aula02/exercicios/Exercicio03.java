package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite o 1a Número: ");
        num1 = teclado.nextDouble();

        System.out.println("Digite a 2a Número: ");
        num2 = teclado.nextDouble();
        // Orderm não crescente

        /*
         * Operadores > , >= , < , <= , != , ==
         */
        if (num1 > num2) {
            System.out.println("Ordem não crescente (a) => " + num1 + " , " + num2);
        } else {
            System.out.println("Ordem não crescente (b) => " + num2 + " , " + num1);
        }

        teclado.close();
    }
}