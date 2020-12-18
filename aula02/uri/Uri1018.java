package uri;

import java.util.Scanner;

public class Uri1018 {
 public static void main(String[] args) {

    Scanner teclado = new Scanner (System.in);

    int valor;
    
    valor  = teclado.nextInt();
    System.out.println(valor);

    int nota100, nota50, nota20, nota10, nota5, nota2, nota1;
    double calc;
    
    calc = valor;
    //System.out.println(calc);
    nota100  = (int) (calc / 100);
    calc = calc - (nota100 * 100);
    System.out.printf("%d nota(s) de R$ 100,00\n" , nota100) ;
    //System.out.println(calc);
    nota50 = (int) (calc / 50);
    calc = calc - (nota50 * 50);
    System.out.printf("%d nota(s) de R$ 50,00\n" , nota50) ;
    //System.out.println(calc);
    nota20   = (int) (calc / 20);
    calc = calc - (nota20 * 20);
    System.out.printf("%d nota(s) de R$ 20,00\n" , nota20) ;
    //System.out.println(calc);
    nota10  = (int) (calc / 10);
    calc = calc - (nota10 * 10);
    System.out.printf("%d nota(s) de R$ 10,00\n" , nota10) ;
    //System.out.println(calc);
    nota5   = (int) (calc / 5);
    calc = calc - (nota5 * 5);
    System.out.printf("%d nota(s) de R$ 5,00\n" , nota5) ;
    //System.out.println(calc);
    nota2    = (int) (calc / 2);
    calc = calc - (nota2 * 2);
    System.out.printf("%d nota(s) de R$ 2,00\n" , nota2) ;
    //System.out.println(calc);
    nota1    = (int) (calc / 1);
    calc = calc - (nota1 * 1);
    System.out.printf("%d nota(s) de R$ 1,00\n" , nota1) ;
    teclado.close();
 }   
}