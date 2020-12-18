package exercicios.Exercicio03;

import java.util.Scanner;
import java.util.ArrayList;

//==============================
// só a interface com o usuário
//==============================
public class AppConta4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        int intNumeroConta = 0;
        String stringNumeroConta = "  ";
        double valor = 0;
        double limite = 0;
        final char VERSAO = '4';

        // ArrayList
        // ArrayList
        // ArrayList
        // ArrayList
        GerenciaConta contas = new GerenciaConta();


        do {
            System.out.println("______________________");
            System.out.println("| Menu <App Conta " + VERSAO + "> |");
            System.out.println("______________________");

            //System.out.println("0 - listar contas ");
            System.out.print("[1]-abrir C/C   ");
            System.out.print("[2]-abrir C/E   ");
            System.out.print("[3]-abrir C/P   ");
            System.out.print("[4]-conultar saldo   ");
            System.out.print("[5]-depositar   ");
            System.out.print("[6]-sacar   ");
            System.out.print("[7]-sair   ");
            System.out.println("");
            System.out.print("|-> ");
            opcao = entrada.nextInt();

            // novas informações de acordo com seleção
            if (opcao >= 1 && opcao <= 6) {
                System.out.println("informe numero da conta:");
                // tem que ser String ?!?!
                intNumeroConta = entrada.nextInt();
                stringNumeroConta  = Integer.toString(intNumeroConta);
            }
            if (opcao >= 5 && opcao <= 6) {
                System.out.println("informe o valor:");
                valor = entrada.nextDouble();
            }

            // ação de acordo com seleção
            switch (opcao) {
/*                 case 0:
                System.out.println("opc0");
                for (Conta c : listaContas) {
                    System.out.println(c);    
                }
                break;                
 */
                case 1:
                    contas.novaContaCorrente(stringNumeroConta);
                    break;

                case 2:
                    System.out.println("informe limite:");
                    limite = entrada.nextDouble();
                    contas.novaContaEspecial(stringNumeroConta, limite);
                    break;

                case 3:
                    contas.novaContaPoupanca(stringNumeroConta);
                    break;

                case 4:
                    System.out.println( contas.exibirSaldo(stringNumeroConta) );
                    break;

                case 5:
                    if(contas.depositar(stringNumeroConta, valor)){
                        System.out.println("Depósito realizado com sucesso.");
                    } else {
                        System.out.println("Depósito não realizado!");
                    }
                    break;

                case 6:
                    if (contas.sacar(stringNumeroConta, valor)) {
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saque não realizado!");
                    }
                    break;

                case 7:
                    break;
                
                default:
                    System.out.println("opção inválida");
                    break;
            }
        } while (opcao != 7);

        if (opcao == 7) {
            System.out.println("<;-)     Obrigado por utiliar <App Conta " + VERSAO + ">");
        }

        entrada.close();
    }

}
