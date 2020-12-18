package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int i;
        final int START_LOOP = 100;
        final int LIMITE_LOOP = 200;

        for (i = START_LOOP; i <= LIMITE_LOOP; i++) {
            if (i == LIMITE_LOOP) {
                System.out.print(i + ".");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
