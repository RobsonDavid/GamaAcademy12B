package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        /*
 Você deve fazer um programa que leia um valor qualquer e 
 apresente uma mensagem dizendo em qual dos seguintes intervalos 
 ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
  Obviamente se o valor não estiver em nenhum destes intervalos, 
  deverá ser impressa a mensagem “Fora de intervalo”.
        */

        Scanner teclado = new Scanner(System.in);
        double valor;

        valor = teclado.nextDouble();


        boolean intervalo1, intervalo2, intervalo3, intervalo4;
        intervalo1 = (valor >= 0) && (valor <= 25);
        intervalo2 = (valor > 25) && (valor <= 50);
        intervalo3 = (valor > 50) && (valor <= 75);
        intervalo4 = (valor > 75) && (valor <= 100 );
        

        if ((valor < 0 ) || (valor > 100)) {
            System.out.println("Fora de intervalo");
        }else {
            if(intervalo1){
                System.out.println("Intervalo [0,25]");
            }else {if (intervalo2){
                     System.out.println("Intervalo (25,50]");}
                    else {if (intervalo3){ 
                        System.out.println("Intervalo (50,75]");}
                        else{if(intervalo4){
                            System.out.println("Intervalo (75,100]");
                        }
                    }
                }
            }
            
        }

        teclado.close();
    }
}
