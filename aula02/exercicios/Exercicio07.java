package exercicios;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;

        System.out.println("Digite o Salário (R$):");
        salario = teclado.nextDouble();

        double desconto;

        if (salario <= 600.00) {
            System.out.println("INSS Isento.");
            desconto = 0;
        } else {
            if (salario <= 1200.00) {
                desconto = (salario * 0.20);
                //System.out.println("Desonto 20% INSS = R$ " + (salario * 0.20));
                System.out.printf("Desonto 20%% INSS = R$  %.2f\n" , desconto);
            } else if (salario < 2000.00) {
                desconto = (salario * 0.25);
                //System.out.println("Desonto 25% INSS = R$ " + (salario * 0.25));
                System.out.printf("Desonto 25%% INSS = R$  %.2f\n" , desconto);
            } else {
                if (salario > 2000.00) {
                    desconto = (salario * 0.30);
                    //System.out.println("Desonto 30% INSS = R$ " + (salario * 0.30));
                    System.out.printf("Desonto 30%% INSS = R$  %.2f\n" , desconto);
                }
            }
        }

        teclado.close();
    }

}