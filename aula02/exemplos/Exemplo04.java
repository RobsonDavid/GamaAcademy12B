package exemplos;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;

        System.out.println("Digite o Nome: ");
        nome = teclado.nextLine();

        // Comparar
        // nome == Robson
        // == true
        // nome.equals("Robson") => Exatamento igual
        // (nome.equalsIgnoreCase("Robson") => ignora MAIUSCULA e minuscula
        if (nome.equalsIgnoreCase("Robson") ) {
            System.out.println("Hello Robson!");
        } else {
            System.out.println("I don't know You!!??!!");
        }

        teclado.close();
    }
}