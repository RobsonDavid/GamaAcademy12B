package exercicio;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        // Variáveis
        String nome;
        double nota1; double nota2;
        double media;
        
        // Entrada de Dados (lê com ',' configuração Windows)
        System.out.println("Digite nome aluno:");
        nome = entrada.nextLine();
        System.out.println("Digite Nota 1:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite Nota 2:");
        nota2 = entrada.nextDouble();
        
        // Cálculo
        media = ((nota1 + nota2) / 2);
        
        // Saída de Dados (mostra com '.' - estudaremos outros comandos com formatação)
        System.out.println( "Aluno: " + nome + " => Média: " + (media) );
     //   System.out.println( "Aluno: " + nome + "=> Média " + ((nota1 + nota2) / 2) );
        
        entrada.close();
    }
}
