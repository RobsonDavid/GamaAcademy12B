package exemplos;

import java.util.Scanner;

public class Exemplo02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in)  ;
    
    double nota;
    System.out.println("Informe a Nota: ");
    nota = teclado.nextDouble();

    if (nota >= 6) {
        System.out.println("Aluno Aprovado!");

    }

    teclado.close();
  }  
}
