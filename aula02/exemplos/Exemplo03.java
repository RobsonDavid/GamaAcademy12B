package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero;
        System.out.println("Digite o Número (par/ímpar): ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par! => " + numero);
        } else {

            System.out.println("Número ímpar! => " + numero);

        }

        teclado.close();
    }
}