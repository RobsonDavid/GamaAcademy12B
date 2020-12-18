package exemplos;

public class Exemplo02 {
   public static void main(String[] args) {
       int cont, soma;

       cont = 1; //valor inicial
       soma = 0;

       while (cont < 10){ // quando para
           System.out.println(cont);
           soma = soma + cont;
           cont++; // incremento
       }
       System.out.println("Soma:" + soma);
       System.out.println("final: " + cont);

   } 
}
