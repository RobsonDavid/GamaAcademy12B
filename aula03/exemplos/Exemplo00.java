package exemplos;

import java.util.Scanner;

public class Exemplo00 {
  public static void main(String[] args) {
    /*
Exemplos de Looping...
    */
    
    Scanner teclado = new Scanner (System.in)  ;
    
    int limite;
    System.out.println("Informe o limite do Loop: ");
    limite = teclado.nextInt();
    //System.out.println(limite);
    
    for (int i=1 ; i<=limite ; i++) {
        // 1o inicializa
        // 2o testa, se true = executa comando
        // 3o incrementa e volta para 2o
        System.out.println("for -> i: " + i);
    }

    int j;
    j = 1;
    while (j <= limite){
        System.out.println("while -> j: " + j);
        j += 1;
    }

    int w=1;
    do {
        System.out.println("do-while -> w: " + w);
        w++;
    }while(w <= limite );

   teclado.close();
  }  
}
