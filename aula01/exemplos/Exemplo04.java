package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        String nome;
        int idade;
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        System.out.println( "Sr/Sra " + nome + " tem " + idade + " anos de idade.");

        entrada.close();
    }
}
