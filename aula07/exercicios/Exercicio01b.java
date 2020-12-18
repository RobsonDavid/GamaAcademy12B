package exercicios;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01b {
    public static void main(String[] args) {
        // calculadora - divisão e try/catch
        // looping até valor válido - sem usar if/else

        Scanner teclado = new Scanner(System.in);
        double num1, num2;
        double resultado;
        boolean numeroOk = false;

        System.out.println("<< Calculadora - divisão >>");

        // num1 = 0 ; num2 = 0;
        do {
            try {
                System.out.println("Digite 2 números: ");
                // num1 = teclado.nextDouble();
                // num2 = teclado.nextDouble();
                num1 = Double.parseDouble(teclado.nextLine());
                num2 = Double.parseDouble(teclado.nextLine());

                if (num2 == 0) {
                    System.out.println("Erro denominador não pode ser 0");
                    continue; // vai para início do loop
                }

                 resultado = num1 / num2;
                //resultado = divide(num1, num2);

                System.out.printf("%f / %f = %f", num1, num2, resultado);

                numeroOk = true;

            } catch (InputMismatchException ex) {
                System.out.println("Erro específico 1: digite corretamente os números");
            } catch (NumberFormatException ex) {
                System.out.println("Erro específico 2: número com decimal deve ser ''.''");
            } catch (ArithmeticException ex) {
                System.out.println("Erro específico 2: denominador não pode ser 0");
            } catch (IllegalFormatConversionException ex) {
                System.out.println("Erro específico3: apresentação");
            } catch (Exception ex) {
                System.out.println("Erro genérico.");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        } while (!numeroOk);

        teclado.close();
    }

   /*  public double divide(double num1, double num2) {
        return (num1 / num2);
    } */
}
