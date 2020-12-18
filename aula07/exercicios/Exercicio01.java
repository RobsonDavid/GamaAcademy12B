package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // calculadora - divisão e try/catch
        // looping até valor válido - sem usar if/else

        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        int resultado;

        System.out.println("<< Calculadora - divisão >>");

        try {
            System.out.println("Digite 1o número: ");
            num1 = teclado.nextInt();

            System.out.println("Digite 2o número: ");
            num2 = teclado.nextInt();

            resultado = num1 / num2;

            System.out.println("Divisão de " + num1 + " por " + num2 + " = " + resultado);

        } catch (InputMismatchException ex) {
            System.out.println("Erro específico 1: input.");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } 
        catch (ArithmeticException ex) {
            System.out.println("Erro específico 2: cálculo.");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Erro genérico.");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            teclado.close();
        }
    }

}
