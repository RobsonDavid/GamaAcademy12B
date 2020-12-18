package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        /*
        Leia 4 valores inteiros A, B, C e D. A seguir, 
        se B for maior do que C e 
        se D for maior do que A, 
        e a soma de C com D for  maior que a soma de A e B 
         e se C e D, ambos, forem positivos e 
         se a variável A for par 
         escrever a mensagem "Valores aceitos", 
        senão escrever "Valores nao aceitos"
        */

        Scanner teclado = new Scanner(System.in);
        int valA;
        int valB;
        int valC;
        int valD;

        //System.out.println("Digite 4 valores:");
        valA = teclado.nextInt();
        valB = teclado.nextInt();
        valC = teclado.nextInt();
        valD = teclado.nextInt();

        boolean comp1, comp2, comp3, comp4, comp5;
        comp1 = valB > valC;
        comp2 = valD > valA;
        comp3 = (valC + valD) > (valA + valB);
        comp4 = (valC > 0) && (valD > 0);
        comp5 = (valA % 2) == 0;

        if((comp1) && (comp2) && (comp3) && (comp4) && (comp5)) {
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }

        teclado.close();
    }
}
