package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {

        System.out.println("Hellow World");
        
        Scanner teclado = new Scanner(System.in);

        char resp;
        int num, acmNum = 0;
        resp = 's';

        while (resp =='s' || resp == 'S') {
            System.out.print("Digite o número para somar: ");
            num = teclado.nextInt();

            acmNum += num;

            System.out.println("Deseja continuar(S/N)? ");
            resp = teclado.next().charAt(0);
        }

        System.out.println("Soma = " + acmNum);

        teclado.close();
        
    }
}
