package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2;
        final int peso1 = 40;
        final int peso2 = 60;

        System.out.println("Digite a 1a Nota: ");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a 2a Nota: ");
        nota2 = teclado.nextDouble();

        double media;
        media = ( ((nota1 * peso1) + (nota2 * peso2)) / 100);
/*
Operadores
> ,  >= , < ,  <= , != ,  ==
*/
        if (media > 6.0) {
            System.out.println("Aluno aprovado!    <;-)");
        } else {
            System.out.println("Aluno reprovado!   <:-(");
            }
        

        teclado.close();
    }
}