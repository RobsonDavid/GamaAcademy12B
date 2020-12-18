package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        
        double valor;
        int totNegativo = 0;
        int totPositivo = 0;
        double somaPositivo = 0;
        final int TOT = 6;

        for(int i = 1; i <= TOT; i++) {
            //System.out.println("Digitel Número: ");
            valor = digita.nextDouble();
            if (valor < 0){
                totNegativo ++;
            } else {
                totPositivo ++;
                somaPositivo += valor;
            }
        }

        System.out.printf("%d valores positivos\n", totPositivo);
        System.out.printf("%.1f\n", ((double) somaPositivo / totPositivo));

        digita.close();
    }
}
