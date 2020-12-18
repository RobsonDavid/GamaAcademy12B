package exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
//        System.out.println("Hi");

        Scanner teclado = new Scanner(System.in);
        int num ; 
        int i = 0;
        int totP = 0, totI = 0;
        final int LIMITE = 10;

        for(i = 1; i <= LIMITE ; i++){
            System.out.printf("Digite o %dº número: ", i);
            num = teclado.nextInt();

            if(num %2 == 0){
                totP ++;
            } else {
                totI ++;
            }
    
        }

        System.out.println("O total de pares é........: " + totP);
        System.out.println("O total de ímpares é......: " + totI);

        teclado.close();
    }
}
