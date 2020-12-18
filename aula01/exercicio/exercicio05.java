package exercicio;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        
        // Variáveis
        double custoFabrica; 
        double custoConsumidor;
        double impostos;

        double percDistr;
        percDistr = 0.28;

        double percImp;
        percImp = 0.45;

        // Entrada de Dados (lê com ',' configuração Windows)
        System.out.println("Preço Carro");
        System.out.println("Custo Fábrica:");
        custoFabrica = teclado.nextDouble();
     
        // Cálculo
        impostos = custoFabrica * percImp;
        custoConsumidor  = (custoFabrica) + (custoFabrica * percDistr) + impostos;
        
        // Saída de Dados (mostra com '.' - estudaremos outros comandos com formatação)
        //System.out.println( "Custo Final Consumidor: " + (custoConsumidor) );
        //System.out.println( "Valor Imposto:  " + (impostos) );
        System.out.printf("Custo Final Consumidor: %.2f\n" , custoConsumidor);
        System.out.printf("Valor Imposto:  %.2f\n" , impostos);


        teclado.close();
    }
}