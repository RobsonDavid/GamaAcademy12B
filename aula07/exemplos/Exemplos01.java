package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplos01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número:");
        try {
            numero = entrada.nextInt();
            System.out.println("Você digitou: " + numero);

            // específico
        } catch (InputMismatchException ex) {
            System.out.println("Você não digitou um número inteiro.");
            System.out.println(ex.getMessage());
            // genérico
        } catch (Exception ex) {
            System.out.println("Você digitou um número int inválido!");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        entrada.close();
    }

}
