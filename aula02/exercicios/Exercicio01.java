package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero;
        System.out.println("Digite o Número: ");
        numero = teclado.nextInt();

        if (numero > 20) {
            System.out.println("Metado do número = " + (numero / 2));
        } else {
            if (numero < 10) {
                System.out.println("Número menor que 10!!!");
            } else { 
                System.out.println("Número menor que 20 e maior que 10!!!");
            }
        
        }

        teclado.close();
    }
}