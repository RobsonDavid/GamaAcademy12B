package exercicio;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        
        // Variáveis
        double km; 
        double kmMilha, milhaJarda, jardaPes, pePolegada;
        
        kmMilha = 0.62137;
        milhaJarda = 1.760;
        jardaPes = 3;
        pePolegada = 12;
        
        // Entrada de Dados (lê com ',' configuração Windows)
        System.out.println("Converão KM");
        System.out.println("Distância em KM:");
        km = teclado.nextDouble();
     
        // Cálculo
        double milha, jarda, pes, polegada;
        milha = km * kmMilha;
        jarda = milha * milhaJarda;
        pes = jarda * jardaPes;
        polegada = pes * pePolegada;

         // Saída de Dados
        System.out.printf("Milhas......: %.5f\n" , milha);
        System.out.printf("Jardas......: %.3f\n" , jarda);
        System.out.printf("Pés.........: %.0f\n" , pes);
        System.out.printf("Polegadas...: %.0f\n" , polegada);

        teclado.close();
    }
}