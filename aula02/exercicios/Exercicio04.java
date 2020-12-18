package exercicios;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario;
        double prestacao;

        System.out.println("Digite o Salario Bruto: ");
        salario = teclado.nextDouble();

        System.out.println("Digite a Prestação: ");
        prestacao = teclado.nextDouble();

        // Calcular prestação 30% < concedido senão não concedido
        double limite;
        limite  = salario * 0.30;
        
        if (prestacao < limite) {
            System.out.println("Empréstimo Concedido");
        } else {
            System.out.println("Empréstimo não Concedido");
        }

        teclado.close();
    }
}