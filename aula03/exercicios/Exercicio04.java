package exercicios;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        int num, acmNum = 0;
        int i =1;
        num = 1;

        while (num > 0) {
            System.out.printf("Digite o %dº número para somar: ", i);
            num = teclado.nextInt();

            acmNum += num;
            i++;
        }

        System.out.println("A soma dos valores é: " + acmNum);
        
    }
}
