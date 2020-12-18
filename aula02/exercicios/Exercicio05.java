package exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String pwd;
        boolean validPwd;
        final String correctPwd = "R10p5";

        System.out.println("Password: ");
        pwd = teclado.nextLine();

        // Comparar
        //validPwd = pwd.equals("R10p5");
        validPwd = pwd.equals(correctPwd);
        if (validPwd) {
            System.out.println("Acess granted!!");
        } else {
            System.out.println("Acess denied??!!");
        }

        teclado.close();
    }
}