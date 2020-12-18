package exercicios.Exercicio03old;

import java.util.Scanner;

public class AppConta2 {
    public static void main(String[] args) {
        System.out.println("Menu <App Conta 2>");

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        int intNumeroConta = 0;
        String stringNumeroConta = "  ";
        double valor = 0;
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        double limite = 0;
        ContaPoupanca cp = null;

        do {
            System.out.println("1 - abrir conta corrente ");
            System.out.println("2 - abrir conta especial ");
            System.out.println("3 - abrir conta popuança ");
            System.out.println("4 - conultar saldo ");
            System.out.println("5 - depositar ");
            System.out.println("6 - sacar ");
            System.out.println("7 - sair ");
            opcao = entrada.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                System.out.println("informe numero da conta:");
                // tem que ser String ?!?!
                intNumeroConta = entrada.nextInt();
                stringNumeroConta  = Integer.toString(intNumeroConta);

            }
            if (opcao >= 5 && opcao <= 6) {
                System.out.println("informe o valor:");
                valor = entrada.nextDouble();
            }

            // trabalhar com conjuntos objetos conta ... saber qual consultar, depositar e sacar

            switch (opcao) {
                case 90: // se 90
                case 91: // ou se 91, faz...
                    System.out.println("Opção 90's");
                    break; // interrompe ... instrução ou laço/looping
                case 1:
                    System.out.println("opc1");
                    cc = new ContaCorrente(stringNumeroConta);
                    break;

                case 2:
                    System.out.println("opc2");
                    System.out.println("informe limite:");
                    limite = entrada.nextDouble();
                    ce = new ContaEspecial(stringNumeroConta, limite);
                    break;

                case 3:
                    System.out.println("opc3");
                    cp = new ContaPoupanca(stringNumeroConta);
                    break;

                case 4:
                    System.out.println("opc4");
                    if (cc != null) {
                    System.out.println(cc);
                    }
                    if (ce != null) {
                        System.out.println(ce);
                    }
                    if (cp != null) {
                        System.out.println(cp);
                    }
                    break;

                case 5:
                    System.out.println("opc5");
                    if (cc != null) {
                        cc.depositar(valor);
                        }
                    if (ce != null) {
                        ce.depositar(valor);
                        }
                    if (cp != null) {
                        cp.depositar(valor);
                        }
                    break;

                case 6:
                    System.out.println("opc6");
                    if (cc != null) {
                        cc.sacar(valor);
                        }
                    if (ce != null) {
                        ce.sacar(valor);
                        }
                    if (cp != null) {
                        cp.sacar(valor);
                        }                    
                    break;

                default:
                    System.out.println("opção inválida");
                    break;
            }
        } while (opcao != 7);

        if (opcao == 7) {
            System.out.println("Obrigado por utiliar <App Conta 2>");
        }

        entrada.close();
    }

}
