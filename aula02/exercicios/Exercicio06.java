package exercicios;

import java.util.Scanner;

public class Exercicio06 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in) ;  
    double nota;
    
    System.out.println("Digite a Nota:");
    nota = teclado.nextDouble();

    if (nota < 5.0) {
        System.out.println("Reprovado");
    }else {
        if (nota < 7.0) {
            System.out.println("Exame");
        }else {
            System.out.println("Aprovado");
        }
    }

    teclado.close();
   }
   
}
