package exercicio;

import java.util.Scanner;

public class exercicio06b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        
        // Variáveis
        double km, valorCalc; 
       
        // constantes
        final double kmMilha = 0.62137;
        final double milhaJarda = 1.760;
        final int jardaPes = 3;
        final int pePolegada = 12;
        
        // Entrada de Dados (lê com ',' configuração Windows)
        System.out.println("Converão KM");
        System.out.println("Distância em KM:");
        km = teclado.nextDouble();
     
        // Cálculo e display
        double milha, jarda, pes, polegada;
        valorCalc = km * kmMilha;
        System.out.printf("Milhas......: %.5f\n" , valorCalc);

        valorCalc = valorCalc * milhaJarda;
        System.out.printf("Jardas......: %.3f\n" , valorCalc);

        valorCalc = valorCalc * jardaPes;
        System.out.printf("Pés.........: %.0f\n" , valorCalc);
                
        valorCalc = valorCalc * pePolegada;
        System.out.printf("Polegadas...: %.0f\n" , valorCalc);

        teclado.close();
    }
}