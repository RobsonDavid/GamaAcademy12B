package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        System.out.println("Heloww Uri1051 !!");

        Scanner teclado = new Scanner(System.in);
        double salBase = 0;
        double salBruto;

        // falta fazer certo...
        System.out.print("Digite o valor do salário: ");
        salBruto = teclado.nextDouble();

        double percent = 0;

        final double INI = 0.00;
        final double LIM1 = 2000.00; // ate 8%
        final double LIM2 = 3000.00; // ate 18%
        final double LIM3 = 4500.00; // ate 28%
        // final double FIM = 4500.00;

        double ir = 0; 

        //salBase = salBruto - LIM1;
        salBase = salBruto;

        if ((salBase >= INI) && (salBase <= LIM1)) {
            percent = 0.00;
        } else {
            if (salBase <= LIM2) {
                percent = 0.08;
            } else {
                if (salBase <= LIM3) {
                    percent = 0.18;
                } else {
                    percent = 0.28;
                }
            }

        }

        if (percent == 0) {
            System.out.println("Isento");
        } else {
            ir = salBase * percent;
            System.out.printf("R$ %.2f", ir);
        }

        teclado.close();
    }
}
