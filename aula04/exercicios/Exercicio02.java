package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        // método - menor entre 3 números
        int a, b, c;
        a = 100;
        b = 1000;
        c = 10;
        int menorNum;

        System.out.println("Número 1: " + a);
        System.out.println("Número 2: " + b);
        System.out.println("Número 3: " + c);
        menorNum = menor(a, b, c);
        System.out.println("Menor número é ...." + menorNum);

    }

    public static int menor(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            return a;
        } else {
            if ((b < a) && (b < c)) {
                return b;
            } else {
                return c;
            }
        }
    }
}
