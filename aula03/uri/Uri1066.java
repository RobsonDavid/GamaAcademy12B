package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);

        int valor;
        int totNegativo = 0;
        int totPositivo = 0;
        int totPar = 0;
        int totImpar = 0;

        final int TOT = 5;

        for (int i = 1; i <= TOT; i++) {
            // System.out.println("Digitel Número: ");
            valor = digita.nextInt();
            if (valor < 0) {
                totNegativo++;
            } else if (valor == 0) {
            } else {
                totPositivo++;
            }
            if (valor % 2 == 0) {
                totPar++;
            } else {
                totImpar++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", totPar);
        System.out.printf("%d valor(es) impar(es)\n", totImpar);
        System.out.printf("%d valor(es) positivo(s)\n", totPositivo);
        System.out.printf("%d valor(es) negativo(s)\n", totNegativo);

        digita.close();
    }
}
