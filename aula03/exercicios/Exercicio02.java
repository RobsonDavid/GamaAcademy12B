package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // tabuada
        int num;
        int i = 0;

        System.out.println("Digite número para tabuada:");
        num = teclado.nextInt();

        while (i <= 10){
            System.out.printf("%d x %d = %d\n", num, i , (num * i));
            i++;
        }

        teclado.close();
    }
}
