package exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        double resultado;

        // 1o resolve e depois vai colocar na variável
        // int dividido por int guarda inteiro
        //resultado = 7 / 9;

        // double dividido por int guarda double
        //resultado = 7.0 / 9;

        double valor;
        valor = 7;
        resultado = valor / 9;

        System.out.println(resultado);

        int valorint;
        valorint = 7;
        // conversao temporaria  = cast
        resultado = (double) valorint / 9;

        System.out.println(resultado);
     
    }
}
