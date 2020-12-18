package uri;
import java.util.Scanner;

public class Uri1051b {
    public static void main(String[] args) {
        //System.out.println("Helow Uri1051B !!");

        Scanner teclado = new Scanner(System.in);
        double salBase = 0;
        double salBruto;

        // calcula % sobre teto da faixa e o que sobra é o que utilizamos na faixa seguinte
        //System.out.print("Digite o valor do salário: ");
        salBruto = teclado.nextDouble();

        double percent = 0;

        final double INI = 0.00;
        final double LIM1 = 2000.00; // ate 8%
        final double LIM2 = 3000.00; // ate 18%
        final double LIM3 = 4500.00; // ate 28%
        // final double FIM = 4500.00;

        double ir = 0; 
        double ir1 = 0;
        double ir2 = 0;
        double ir3 = 0;
        double ir4 = 0;

        //salBase = salBruto - LIM1;
        salBase = salBruto;

        if ((salBase >= INI) && (salBase <= LIM1)) {
            percent = 0.00;
            ir1 = 0;
        } else {
            if (salBase <= LIM2) {
                ir1 = 0;
                salBase = salBase - 2000;
                percent = 0.08;
                ir2 = salBase * percent;
            } else {
                if (salBase <= LIM3) {
                    ir1 = 0;
                    ir2 = (3000 - 2000) * 0.08;
                    salBase = salBase - (2000 + 1000);
                    percent = 0.18;
                    ir3 = salBase * percent;
                } else {
                    ir1 = 0; 
                    ir2 = (3000 - 2000) * 0.08;
                    ir3 = 1500 * 0.18;
                    salBase = salBase - (2000  + 1000 + 1500);
                    percent = 0.28;
                    ir4 = salBase * percent;
                }
            }
        }

        if (percent == 0) {
            System.out.println("Isento");
        } else {
            ir = ir1 + ir2 + ir3 + ir4;
            System.out.printf("R$ %.2f\n", ir);
        }

        teclado.close();        
    }
}
