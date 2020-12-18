package exemplos;

public class Exemplo07 {
 public static void main(String[] args) {
     double resultado;

     resultado = 7.0 /9;

     System.out.println(resultado);
     // print formatado (FORMATO, VALORES)
     // %d - interiro
     // %f - decimal
     // %s - string
     // %c - caracter
     // %  tamanho f = quantidade de casas decimais
     System.out.printf("O resultado é %.2f\n" , resultado);


     System.out.printf("calculando... %d / %d = %.2f\n" , 7 , 9 , resultado);
 }   


}
