package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num ; 
        int i = 0;
        int totP = 1, totI = 1;
        final int LIMITE = 5;
        double mediaP;
        int somaP = 0;
        double percI;

        totP--;
        totI--;

        for(i = 1; i <= LIMITE ; i++){
            System.out.printf("Digite o %dº número: ", i);
            num = teclado.nextInt();

            if(num %2 == 0){
                totP ++;
                somaP += num;
            } else {
                totI ++;
            }
    
        }

        if(totP == 0){
            System.out.println("Não existem valores pares");
    
        }else {
            mediaP = ( (double)somaP / totP);
            System.out.println("A média dos valores pares é........: " + mediaP);
    
        }
        percI = ((double)totI * 100) / LIMITE;
        System.out.println("O percentual dos valores ímpares é......: " + percI);

        teclado.close();
    }
}
