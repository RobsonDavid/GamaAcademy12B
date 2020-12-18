package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // 1 professor - 5 turmas com 20 alunos ... media turmas e media geral

        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        int i = 0; // turmas
        int j = 0; // alunos
        double somaTurma;
        double somaGeral = 0;
        final int LIM_TURMA = 2;
        final int LIM_ALUNO = 3;

        for (i = 1; i <= LIM_TURMA; i++) {
            somaTurma = 0;
            for (j = 1; j <= LIM_ALUNO; j++) {
                System.out.printf("Turma [%d] Aluno [%d] - Média: ", i, j);
                nota = teclado.nextDouble();
                somaTurma += nota;
            }
            System.out.printf(">> Média Turma [%d] = %.2f\n", i, (somaTurma / LIM_ALUNO));
            somaGeral += somaTurma;
        }

        System.out.printf(">>>> Média Geral das Turmas = %.2f", (somaGeral / (LIM_TURMA * LIM_ALUNO)));

        teclado.close();
    }
}
