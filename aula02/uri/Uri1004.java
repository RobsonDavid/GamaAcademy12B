package uri;
import java.util.Scanner;

public class Uri1004 {
 public static void main(String[] args) {

    Scanner teclado = new Scanner (System.in);

    int a , b;
    int prod;

    a = teclado.nextInt();
    b = teclado.nextInt();

    prod  = a * b ;

    System.out.println("PROD = " + prod);

    teclado.close();
 }   
}
