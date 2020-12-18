package exercicio;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        // Variáveis
        double salarioAtu; 
        double salarioNew;
        
        // Entrada de Dados (lê com ',' configuração Windows)
        System.out.println("Cálculo Novo Salário (+25%)");
        System.out.println("Digite Salário:");
        salarioAtu = teclado.nextDouble();
        
        // Cálculo
        salarioNew = (salarioAtu * 1.25) ;
        
        // Saída de Dados (mostra com '.' - estudaremos outros comandos com formatação)
        System.out.println( "Novo Salário Calculado: " + (salarioNew) );

        
        teclado.close();
    }
}
