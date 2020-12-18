package exercicios.Exercicio05;

import java.util.Scanner;

public class AppRobo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int inix, iniy;
        System.out.print("Digite X inicial: ");
        inix = teclado.nextInt();
        System.out.println();
        System.out.print("Digite Y inicial: ");
        iniy = teclado.nextInt();

        Robo robot = new Robo(inix, iniy, 6, -6, -6, 6);

        robot.ondeEstou();

        robot.moverLeste();robot.ondeEstou();
        robot.moverNorte();robot.ondeEstou();
        //robot.ondeEstou();

        robot.moverLeste();robot.ondeEstou();
        robot.moverLeste();robot.ondeEstou();
        robot.moverSul();robot.ondeEstou();
        robot.moverNorte();robot.ondeEstou();
        robot.moverNorte();robot.ondeEstou();
        robot.moverNorte();robot.ondeEstou();
        robot.moverNorte();robot.ondeEstou();
        //robot.ondeEstou();

        teclado.close();

    }
}
