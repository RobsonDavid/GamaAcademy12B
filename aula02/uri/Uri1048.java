package uri;
import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double salario;

        salario = teclado.nextDouble();

        double novoSal;
        double reajuste;
        double percent;
        percent = 0;

        if ((salario >= 0) && (salario <= 400)) {
            percent = 0.15;
        } else {
            if (salario <= 800) {
                percent = 0.12;
            } else {
                if (salario <= 1200) {
                    percent = 0.10;
                } else {
                    if (salario <= 2000) {
                        percent = 0.07;
                    } else {
                        percent = 0.04;
                    }
                }

            }

        }


      
        if (salario >= 0) {
            int calc;
            //System.out.println(percent);
            calc = (int) (percent * 100);
            //System.out.println(calc);
    
            reajuste = salario * percent;
            novoSal = salario + reajuste;
            //System.out.println("Novo salario: " + novoSal);
            //System.out.println("Reajuste: " + reajuste);
            //System.out.println("Em percentual: " + calc + " %");

            System.out.printf("Novo salario: %.2f\n", novoSal );
            System.out.printf("Reajuste ganho: %.2f\n", reajuste );
            System.out.printf("Em percentual: %d %%\n", calc );
        }

        teclado.close();
    }
}
