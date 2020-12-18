package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int ladoA ;
        int ladoB ;
        int ladoC ;
        boolean naoEhTriangulo;

        System.out.println("Digite o valor do lado A:");
        ladoA = teclado.nextInt();
        System.out.println("Digite o valor do lado B:");
        ladoB = teclado.nextInt();
        System.out.println("Digite o valor do lado C:");
        ladoC = teclado.nextInt();

        // é triangulo? qual tipo ?
        naoEhTriangulo  =
           ((ladoA > (ladoB + ladoC)) 
        ||  (ladoB > (ladoA + ladoC)) 
        ||  (ladoC > (ladoA + ladoB))) ;
        
        if (naoEhTriangulo) {
            System.out.println("Não é um triângulo");
        } else {
            System.out.println("É um triângulo");
            if ((ladoA == ladoB) 
            &&  (ladoB == ladoC)) {
                System.out.println("Triângulo EQUILÁTERO.");
            } else {
                if ((ladoA == ladoB) 
                ||  (ladoB == ladoC) 
                ||  (ladoA == ladoC)) {
                    System.out.println("Triângulo ISÓSCELES.");
                } else {
                    System.out.println("Triângulo ESCALENO.");
                }
            } 
        }
                    //System.out.println("Desonto 30% INSS = R$ " + (salario * 0.30));
        
        teclado.close();
    }

}