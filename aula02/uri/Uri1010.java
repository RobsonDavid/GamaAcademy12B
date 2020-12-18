package uri;
import java.util.Scanner;

public class Uri1010 {
 public static void main(String[] args) {

    Scanner teclado = new Scanner (System.in);

    int cod1, qtde1;
    double val1;

    int cod2, qtde2;
    double val2;
    
    cod1  = teclado.nextInt();
    qtde1 = teclado.nextInt();
    val1  = teclado.nextDouble();

    cod2  = teclado.nextInt();
    qtde2 = teclado.nextInt();
    val2  = teclado.nextDouble();

    Double valPagar;
    valPagar = (qtde1 * val1) + (qtde2 * val2);

    System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valPagar );

    teclado.close();
 }   
}