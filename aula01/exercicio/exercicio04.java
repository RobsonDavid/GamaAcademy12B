package exercicio;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        // Variáveis
        double salarioMin; 
        double quantidadeKw;
        
        // Entrada de Dados (lê com ',' configuração Windows)
        System.out.println("QuiloWat");
        System.out.println("Digite Salário Mínimo:");
        salarioMin = teclado.nextDouble();
        System.out.println("Digite Consumo KwW:");
        quantidadeKw = teclado.nextDouble();

        // Cálculo
        double valorKw, valor, valorDesconto;
        valorKw = salarioMin / 500;
        valor = quantidadeKw * valorKw;
        valorDesconto = (valor - (valor * 0.15)) ;
        
        // Saída de Dados (mostra com '.' - estudaremos outros comandos com formatação)
        System.out.println( "Valor R$ por quilowatt: " + (valorKw) );
        System.out.println( "Valor R$ a pagar:  " + (valor) );
        System.out.println( "Valor R$ a pagar com 15% desconto: " + (valorDesconto) );

        teclado.close();
    }
}
