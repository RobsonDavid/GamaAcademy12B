package uri;

import java.util.Scanner;

public class Uri1117 {
 public static void main(String[] args) {
     //System.out.println("Oi");

     Scanner teclado = new Scanner(System.in);

     Double nota1 = 0.0;
     double nota2 = 0.0;
     final double LIMITE_INFERIOR = 0.0;
     final double LIMITE_SUPERIOR = 10.0;
     boolean notaOk = false;

     do {
         //System.out.print("Digite a nota 1: ");
         nota1 = teclado.nextDouble();

         if (nota1 >= LIMITE_INFERIOR && nota1 <= LIMITE_SUPERIOR){
             notaOk = true;
           } else {
             System.out.println("nota invalida");
         }
     } while (! notaOk);

     notaOk = false;
     do {
        //System.out.print("Digite a nota 2: ");
        nota2 = teclado.nextDouble();

        if (nota2 >= LIMITE_INFERIOR && nota2 <= LIMITE_SUPERIOR){
            notaOk = true;
          } else {
            System.out.println("nota invalida");
        }
    } while (! notaOk);

     System.out.printf("media = %.2f\n", ((nota1 + nota2) / 2) );

     teclado.close();     

 }   
}
