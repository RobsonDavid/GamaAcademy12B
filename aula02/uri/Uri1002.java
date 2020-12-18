package uri;
import java.util.Scanner;

public class Uri1002 {
 public static void main(String[] args) {

    Scanner teclado = new Scanner (System.in);

    int a , b;
    int soma;

    a = teclado.nextInt();
    b = teclado.nextInt();

    soma  =a + b ;

    System.out.println("SOMA = " + soma);

    teclado.close();
 }   
}
