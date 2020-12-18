package exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        int a;
        int b;

        a = 15;
        b = 2;
        System.out.printf("Dividir %d por %d\n", a , b);
        System.out.println("Divisão inteiro: " + (a / b));
        System.out.println("Resto Divisão: " + (a % b));

        a = 15;
        b = 3;
        System.out.printf("\nDividir %d por %d\n", a , b);
        System.out.println("Divisão inteiro: " + (a / b));
        System.out.println("Resto Divisão: " + (a % b));

        double aa;
        double bb;
        System.out.println(".");
        aa = 15.0;
        bb = 2.0;
        System.out.printf("Dividir %f por %f\n", aa , bb);
        System.out.println("Divisão inteiro: " + (aa / bb));
        System.out.println("Resto Divisão: " + (aa % bb));

        aa = 15.0;
        bb = 3.0;
        System.out.printf("\nDividir %f por %f\n", aa , bb);
        System.out.println("Divisão inteiro: " + (aa / bb));
        System.out.println("Resto Divisão: " + (aa % bb));

        aa = 15.712340;
        bb = 3.123140;
        System.out.printf("\nDividir %f por %f\n", aa , bb);
        System.out.println("Divisão inteiro: " + (aa / bb));
        System.out.println("Resto Divisão: " + (aa % bb));
    }
}
