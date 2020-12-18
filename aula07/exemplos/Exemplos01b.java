package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplos01b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        // todo try tem que ter pelo meno 1 catch ... finally é opcional (sempre executa)
        try {
            //1ENTER
           /*  System.out.println("Digite um número:");
           // pegou "1", sobrou ENTER no buffer
            numero = entrada.nextInt();
            System.out.println("Você digitou: " + numero); */


            // problema no Scanner - buffer ... quando nextInt ou nextDouble e depois um nextLine
            // alternativa 1: incluir um nextLine para "esvaziar" o buffer
            // alternativa 2: trocar nextInt e nextDouble ... por nextLine
            System.out.println("Digite outro número:");
            String texto = entrada.nextLine();
            numero = Integer.parseInt(texto);
            System.out.println("Você digitou outro: " + numero); 

            // específico
        } catch (NumberFormatException ex) {
            System.out.println("Você também digitou um número inválido.");
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Você não digitou um número inteiro.");
            System.out.println(ex.getMessage());
            // genérico
        } catch (Exception ex) {
            System.out.println("Você digitou um número int inválido!");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally { // sempre executa!
            entrada.close();
        }

    }

}
