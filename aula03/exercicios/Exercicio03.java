package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // sequencia
        int num;

        System.out.println("Digite número:");
        num = teclado.nextInt();

        System.out.print("Sequência impressa: ");
        int cont;
        cont = 1;
        while(cont <= num) {
            System.out.print(cont + ", ");
            cont *= 2; //cont = cont * 2;
        }

        teclado.close();
    }
}